class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
    int[][] board=new int[n][n];
    List<String> subans=new ArrayList<>();
    totalNQueens(board,0,subans);

    return ans;
    }

    private void totalNQueens(int[][] board,int r,List<String> subans) {
        if(r== board.length){
              ans.add(new ArrayList<>(subans)); 
              return;
        }

        int count=0;
        for (int i = 0; i < board.length ; i++) {
            if(isSafe(board,r,i)){
                String curr="";
                for(int j=0;j<board[0].length;j++){
                    if(j==i)curr+='Q';
                    else curr+='.';
                }
                subans.add(curr);
                board[r][i]=1;
                totalNQueens(board,r+1,subans);
                board[r][i]=0;
                subans.remove(subans.size() - 1);
            }
        }
        return;
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