class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] dp = new Integer[n + 1][target + 1];
        return numRollsToTarget(n, k, target, dp);
    }
     public int numRollsToTarget(int n, int k, int target,Integer[][] t) {
        if (n == 0 && target == 0) return 1;
        if (n == 0 || target <= 0) return 0;
        if(t[n][target]!=null){
            return t[n][target];
        }
        int count=0;
        for (int i = 1; i <= k && i<=target; i++) {
            count+=numRollsToTarget(n-1,k,target-i,t);
            count %= 1_000_000_007;
        }
        return t[n][target]= count;
    }
}