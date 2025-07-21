class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
        s=s.trim();
        t=t.trim();
        int j=0;
          for (int i = 0; i < t.length() && j<s.length() ; i++) {
          if(t.charAt(i)==s.charAt(j)){
            j++;
          }
        }
        return j==s.length();
    }
}