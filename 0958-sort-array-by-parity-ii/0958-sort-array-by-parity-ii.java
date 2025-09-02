class Solution {
       public int[] sortArrayByParityII(int[] nums) {
int i =0 , j=0;
while(i<nums.length){
    if(i%2==0 && nums[j]%2!=0 ){
        while(j<nums.length && nums[j]%2!=0)j++;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
     
    }
    if(i%2==1 && nums[j]%2!=1){
        while(j<nums.length && nums[j]%2!=1)j++;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
   
    }
      i++;
        j=i;
}
return nums;
    }
}