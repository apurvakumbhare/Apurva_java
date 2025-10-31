class Solution {
     public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int count=0;
        int less=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==pivot)count++;
            if(nums[i]<pivot)less++;
        }
        int i=0;
        int j=less+count;
        for (int k = 0; k < ans.length; k++) {
           
                if(nums[k]<pivot){
                    ans[i]=nums[k];
                    i++;
                }
                if(nums[k]>pivot){
                    ans[j]=nums[k];
                    j++;
                }
                if(nums[i]==pivot)continue;
            
        }
       while(count>0){
           ans[i]=pivot;
           i++;
           count--;
       }
        return ans;
    }
}