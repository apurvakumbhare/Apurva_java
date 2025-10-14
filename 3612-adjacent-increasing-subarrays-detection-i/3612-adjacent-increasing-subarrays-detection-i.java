class Solution {
   public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
    if(k==1)return true;
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            int next=i+k;
            for (int j = 1; j < k; j++) {
                if (nums.get(i + j) <= nums.get(i + j - 1) ||
                    nums.get(next + j) <= nums.get(next + j - 1)) {
                    break;
                }
                if(j==k-1){
                    return true;
                }
            }
        }  return false;
    }
}