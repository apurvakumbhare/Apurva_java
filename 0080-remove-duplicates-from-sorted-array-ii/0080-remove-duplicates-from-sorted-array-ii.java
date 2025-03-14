class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) {return 0;}
      int count=1;
      int k=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                k++;
              }
              else{
                k=1;
                
              }
            
              
             if(k<=2){
             nums[count]=nums[i];
             count++;
             
             }
             
             
        }
        return count;  
    }
}