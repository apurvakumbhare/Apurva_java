// User function Template for Java
class Solution {
    static String[] wordBreak(String[] dict, String s) {
         List<String> list =new ArrayList<>();
         HashSet<String> set=new HashSet<>(Arrays.asList(dict));
         wordBreakable(set, s,"",0,list);
         return list.toArray(new String[0]);
    }
    public static void wordBreakable(HashSet<String> set, String s,String up,int i,List<String> list){
        if(i==s.length()){
            list.add(up.trim());
            return;
        }
        for(int j=i;j<s.length();j++){
            if(set.contains(s.substring(i,j+1))){
                String toadd;
                if(up.length()==0)toadd=s.substring(i,j+1);
                else toadd=" "+s.substring(i,j+1);
                wordBreakable(set, s,up+toadd,j+1,list);
                
            }
        }
        
    }
}