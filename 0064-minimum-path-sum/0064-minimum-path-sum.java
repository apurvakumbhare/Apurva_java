class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Integer[][] memo = new Integer[rows][cols];
        return minPathSum(grid,0,0,0, memo);
    }

    private int minPathSum(int[][] grid, int r, int c,int sum, Integer[][] memo) {
        if(r==grid.length-1 && c==grid[0].length-1){
            sum+=grid[r][c];
            return sum;
        }
        if (memo[r][c] != null) {
            return memo[r][c] + sum;
        }
        int minSum=Integer.MAX_VALUE;
        if(r+1<grid.length)
       minSum= Math.min(minSum,minPathSum(grid,r+1,c,sum+grid[r][c],memo));
        if(c+1<grid[0].length)
       minSum= Math.min(minSum,minPathSum(grid,r,c+1,sum+grid[r][c],memo));
        memo[r][c] = minSum - sum;
        return minSum;
    }
}