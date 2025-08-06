class Solution {
  public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>() );
        for (int i = 0; i <nums.length ; i++) {
            int n=ans.size();
            for (int j = 0; j < n; j++) {
                List<Integer> newly=new ArrayList<>(ans.get(j));
                newly.add(nums[i]);
                ans.add(newly);
            }

        }
        return ans;
    }
}