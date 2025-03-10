class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=binarysearch(nums,target,true);
        int end=binarysearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int binarysearch(int[] nums, int target,boolean startIndex){
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>nums[mid]){
                s=mid+1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                ans=mid;
                if(startIndex){
                  e=mid-1;
                }else{
                  s=mid+1;
                }
            }
        }
        return ans;
    }
}