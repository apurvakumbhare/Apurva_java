class Solution {
     public boolean areOccurrencesEqual(String s) {
int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        int count=0;
        for (int i = 0; i <freq.length ; i++) {
            if(count==0 && freq[i]!=0)count=freq[i];
            if(freq[i] != 0 && count!=freq[i])return false;
        }
        return true;
    }
}