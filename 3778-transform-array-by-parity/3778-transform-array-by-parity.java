class Solution {
   public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)nums[i]=0;
            if(nums[i]%2==1)nums[i]=1;
        }
        int i=0,k=0;
        int j =nums.length-1;
        while(k<j){
            if(nums[k]==1){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;
            }
            else{
                k++;
            }
        }
        return nums;
    }
}