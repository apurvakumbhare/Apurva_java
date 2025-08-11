class Solution {
     public int totalNQueens(int n) {
    int[][] board=new int[n][n];
     return totalNQueens(board,0);
    }

    private int totalNQueens(int[][] board, int r) {
        if(r== board.length){
            return 1;
        }

        int count=0;
        for (int i = 0; i < board.length ; i++) {
            if(isSafe(board,r,i)){
                board[r][i]=1;
                count+=totalNQueens(board,r+1);
                board[r][i]=0;
            }
        }
        return count;
    }

    private boolean isSafe(int[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            if(board[i][c]==1){
                return false;
            }
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}