class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] resulttantArray=new int[nums.length];
        int i =0,j=nums.length-1,k=nums.length-1;
        while(i<=j){
               resulttantArray[k--]=(Math.abs(nums[i]) > Math.abs(nums[j]))?nums[i++]:nums[j--]; 
        }
        for(int t=0;t<nums.length;t++){
            resulttantArray[t]=resulttantArray[t]*resulttantArray[t];
        }
       
        return resulttantArray;
    }
}