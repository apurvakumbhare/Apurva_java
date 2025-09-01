class Solution {
      public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String a){
        if(a.length()==1){
            return  true;
        }
        int i=0, j=a.length()-1;
        while(i<j){
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}