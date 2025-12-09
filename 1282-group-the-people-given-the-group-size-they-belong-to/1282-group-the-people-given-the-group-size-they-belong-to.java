class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    Map<Integer,List<Integer>> list=new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if(list.containsKey(groupSizes[i]) &&  list.get(groupSizes[i]).size()<groupSizes[i]){
                list.get(groupSizes[i]).add(i);
            }
            else{
                List<Integer> sublist =new ArrayList<>();
               sublist.add(i);
                list.put(groupSizes[i],sublist );
            }
            if (list.get(size).size() == size) {
                answer.add(new ArrayList<>(list.get(size)));
                list.put(size, new ArrayList<>());  // reset for next group
            }
        }



        return  answer;
    }
}