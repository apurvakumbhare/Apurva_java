class Solution {
 public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] a={1 ,2,3,4,5,6,7,8,9};
        ArrayList<Integer> es=new ArrayList<>();
        combinationSum3(a,0,k,n,ans,es,n);
        return ans;
    }

    private void combinationSum3(int[] a,int i,int k, int n, List<List<Integer>> ans, ArrayList<Integer> es,int sum) {
    if(es.size() == k && sum == 0){
        ans.add(new ArrayList<>(es));
        return;
    }
    if (i >= a.length) return;
        if(es.size()>k || sum<0){
            return;
        }
           es.add(a[i]);
        combinationSum3(a, i + 1, k, n, ans, es, sum - a[i]);
        es.remove(es.size() - 1);

        
        combinationSum3(a, i + 1, k, n, ans, es, sum);

}
}