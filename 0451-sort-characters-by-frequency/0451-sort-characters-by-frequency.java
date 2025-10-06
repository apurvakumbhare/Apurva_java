class Solution {
     public String frequencySort(String s) {
        Map<Character,Integer> tm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(tm.containsKey(s.charAt(i))){
                int old=tm.get(s.charAt(i));
                tm.replace(s.charAt(i),old,old+1);
            }
            else{
                tm.put(s.charAt(i),1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(tm.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
          int count=entry.getValue();
            while(count!=0){
                sb.append(entry.getKey());
                count--;
            }
        }
      return   sb.toString();
    }
}