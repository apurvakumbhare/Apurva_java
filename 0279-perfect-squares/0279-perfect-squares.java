class Solution {
       public int numSquares(int n) {
        int[][] dp=new int[(int)Math.sqrt(n)+1][n+1];
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i]=Integer.MAX_VALUE-1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(i*i<=j) {
                    dp[i][j]=Math.min(1+dp[i][j-(i*i)],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[(int)Math.sqrt(n)][n];
    }
}