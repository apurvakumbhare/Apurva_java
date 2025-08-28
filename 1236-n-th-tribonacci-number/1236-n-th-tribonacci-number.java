class Solution {
     public int tribonacci(int n) {
        int[] dp=new int[38];
        
        return tribonacci(n,dp);
    }
    public int tribonacci(int n,int[] dp) {
if(n==0)return 0;

        if(n==1||n==2)return 1;
        if(dp[n]!=0)return dp[n];
        return dp[n]=tribonacci(n-3,dp)+tribonacci(n-1,dp)+tribonacci(n-2,dp);
    }
}