class Solution {
   public int maxFreqSum(String s) {
int[]  freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        int vowel=0, consonant=0;
        
        for (int i = 0; i < 26; i++) {
            if("aeiou".indexOf(i+'a')!=-1){
                vowel=Math.max(vowel,freq[i]);
            }
            else consonant=Math.max(consonant,freq[i]);
        }
        return vowel+consonant;
    }
}