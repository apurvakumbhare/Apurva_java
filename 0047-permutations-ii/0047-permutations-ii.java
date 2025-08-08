class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) { List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0)return ans;
        findPermutation(nums,new ArrayList<>(),ans);
        ans=ans.stream().distinct().collect(Collectors.toList());
        return ans;
    }
    private void findPermutation(int[] nums, List<Integer> processsed,List<List<Integer>> ans) {
        if(nums.length==0){

            ans.add(new ArrayList<>(processsed));
            return;
        }
        int num=nums[0];
        for (int i = 0; i <=processsed.size() ; i++) {
            processsed.add(i,num);
            findPermutation(Arrays.copyOfRange(nums,1,nums.length),processsed,ans);
            processsed.remove(i);
        }
    }
}