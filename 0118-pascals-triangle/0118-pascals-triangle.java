class Solution {
   public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list=new ArrayList<>();
            for (int i = 1; i <=numRows ; i++) {
                List<Integer> a=new ArrayList<>();
                    list.add(helper(i, a, i == 1 ? null : list.get(list.size() - 1)));
            }
            return list;
        }

        private List<Integer> helper(int numRows, List<Integer> list, List<Integer> old) {
        if(numRows==1) {
              list.add(1);
              return list;
            }
            if(!old.isEmpty()) {
                list.add(1);
                for (int i = 0; i <numRows-2; i++) {
                    list.add(old.get(i)+old.get(i+1));
                }
                list.add(1);
            }

            return list;
        }
}