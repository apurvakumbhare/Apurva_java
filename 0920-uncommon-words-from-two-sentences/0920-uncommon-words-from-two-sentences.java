class Solution {
 public String[] uncommonFromSentences(String s1, String s2) {
        String[] first=s1.split("\\s+");
        String[] second=s2.split("\\s+");
        HashMap<String,Integer> map=new HashMap<>();
        int i=0;
        while (i<first.length){
            if(map.containsKey(first[i])){
             int   old= map.get(first[i]);
             map.replace(first[i],old,old+1);
            }
            else{
                map.put(first[i],1);
            }
            i++;
        }
        i=0;
        while (i<second.length){
            if(map.containsKey(second[i])){
                int   old= map.get(second[i]);
                map.replace(second[i],old,old+1);
            }
            else{
                map.put(second[i],1);
            }
            i++;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> ent:map.entrySet()){
            if(ent.getValue()==1)ans.add(ent.getKey());
        }
        return ans.toArray(new String[0]);
    }
}