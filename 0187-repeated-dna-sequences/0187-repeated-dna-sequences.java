class Solution {
     public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> ans=new HashSet<>();
        int i=0;
        int j =0;
        while(j<s.length()){
            
            if((j-i)+1<10){
                j++;
            }
            else if((j-i)+1==10){
                String cur=s.substring(i,j+1);
                if(set.contains(cur)){
                  ans.add(cur);  
                }else{
                set.add(cur);}
              
                i++;
                j++;
            }
        }
        return ans.stream().toList();
    }
}