class Solution {
    public String reverseWords(String s) {
        String[] given=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        for (int i = given.length-1; i >=0 ; i--) {     
            if(i==0){
                ans.append(given[i]);
                continue;
            }
            ans.append(given[i]);
            ans.append(" ");
        }

        return ans.toString();
    }
}