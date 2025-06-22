class Solution {
   public String[] divideString(String s, int k, char fill) {
        ArrayList<String> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if(i+k>=s.length()){
                ans.add(s.substring(i,s.length()));
                break;
            }
            ans.add(s.substring(i,i+k));
            i=i+k;
        }
        StringBuilder last=new StringBuilder(ans.removeLast());
        while (last.length()!=k){
           last.append(fill);
        }
        ans.add(last.toString());
        return ans.stream().toArray(String[]::new);

    }
}