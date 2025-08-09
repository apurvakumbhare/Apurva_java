class Solution {
public boolean canPartition(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
        return subsetSum(nums,sum/2, nums.length);
    }

    private boolean subsetSum(int[] nums, int sum,int n) {
        boolean[][] t=new boolean[nums.length+1][sum+1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(i==0)t[i][j]=false;
               else if(j==0)t[i][j]=true;
                else {if(nums[i-1]<=j)
                    t[i][j] = (t[i - 1][j - nums[i - 1]] || t[i - 1][j]);
                    else  t[i][j]= t[i-1][j];
                    
        }
               
            }
        }
        return t[n][sum];
    }
}