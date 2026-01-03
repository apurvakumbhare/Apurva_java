class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int minEle=0;
            while(nums[i]>0){
                minEle+=(nums[i]%10);
                nums[i]/=10;
            }
            if(min>minEle)min=minEle;
        }
        
        
        return min;
    }
}