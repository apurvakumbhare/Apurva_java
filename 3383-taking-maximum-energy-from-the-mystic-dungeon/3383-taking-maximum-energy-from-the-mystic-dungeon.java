class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max=Integer.MIN_VALUE;
        int[] dp=new int[energy.length];
        for (int i = 0; i < energy.length; i++) {
         max=Math.max(maximumEnergy(energy,k,i,0,dp), max)   ;
        }
                
      return   max;

    }

    private int maximumEnergy(int[] energy, int k, int i,int sum,int[] dp) {
        if(i>=energy.length){
           return sum;
        }
       if (dp[i] != Integer.MIN_VALUE && dp[i] != 0) {
            return sum + dp[i];
        }

      
        int next = maximumEnergy(energy, k, i + k, 0, dp);
        dp[i] = energy[i] + (i + k < energy.length ? dp[i + k] : 0); 
        return sum + dp[i];
    }
}