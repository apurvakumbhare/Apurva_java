class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result =new int[nums.length];
        int p=0,q=n;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0)result[i]=nums[p++];
            else result[i]=nums[q++];
        }
        return result;
    }
}