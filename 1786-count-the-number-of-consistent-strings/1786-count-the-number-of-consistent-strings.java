class Solution {
   public int countConsistentStrings(String allowed, String[] words) {
int count=0;
    for (int i = 0; i < words.length; i++) {
        if(isConsistent(allowed,words[i]))count++;
    }
    return count;
}

private boolean isConsistent(String allowed, String word) {
if(allowed.equals(word))return true;
    for (int i = 0; i < word.length(); i++) {
        if(allowed.indexOf(word.charAt(i))==-1)return false;
    } 
    return true;
}
}