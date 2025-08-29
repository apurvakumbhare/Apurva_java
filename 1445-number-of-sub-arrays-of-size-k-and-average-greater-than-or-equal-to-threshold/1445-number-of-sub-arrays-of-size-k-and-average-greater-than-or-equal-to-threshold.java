class Solution {
  public int numOfSubarrays(int[] nums, int k, int threshold) {

        int sum=0;
       int  avg=0;
        int i=0;
        int j =0;
        int count=0;
        while(j< nums.length){
            sum+=nums[j];
            if((j-i)+1<k){
                j++;
            }
            else if((j-i)+1==k){
                avg=sum/k;
                if(avg>=threshold)count++;
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return count;
    }
}