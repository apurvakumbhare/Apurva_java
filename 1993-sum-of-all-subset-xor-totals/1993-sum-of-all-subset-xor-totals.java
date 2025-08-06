class Solution {
 
    public int subsetXORSum(int[] nums) {
        List<Integer> ans=new ArrayList<>();
     ans.add(0);
        int XOR_total=0;
        for (int i = 0; i <nums.length ; i++) {
            int n=ans.size();
            for (int j = 0; j < n; j++) {
               int newly=ans.get(j)^nums[i];
               ans.add(newly);
                XOR_total+=newly;
            }

        }
        return XOR_total;
    }
}