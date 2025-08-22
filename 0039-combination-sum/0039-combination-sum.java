class Solution {
      public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        if(candidates.length==0)return ans;
        combinationSum( candidates, target,0,ans,new ArrayList<>());
        return ans;
    }

    private void combinationSum(int[] candidates, int target, int i, List<List<Integer>> ans,List<Integer> temp) {
        if(i==candidates.length)return;
        if(target==0){ans.add(new ArrayList<>(temp)); return;}

    if(candidates[i]<=target){
        temp.add(candidates[i]);
      combinationSum(candidates,target-candidates[i],i,ans,temp);
       temp.remove(temp.size() - 1);
    }
    combinationSum(candidates,target,i+1,ans,temp);
    return;
    }
}