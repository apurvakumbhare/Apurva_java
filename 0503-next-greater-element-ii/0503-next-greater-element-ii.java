class Solution {
    public int[] nextGreaterElements(int[] nums) {
int [] ans=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
              boolean found = false; 
            for (int j = 1; j < nums.length; j++) {
                 int idx = (i + j) % nums.length; 
                if(nums[i]<nums[idx]){
                    ans[i]=nums[idx];
                    found=true;
                    break;
                }
            }
            if(!found){
                ans[i]=-1;
            }
        }
        return ans;
    }
}