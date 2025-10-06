class Solution {
   public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for (int i = left; i <=right ; i++) {
            if(isVowelString(words[i]))count++;
        }
        return count;
    }

    private boolean isVowelString(String word) {
        String vowel="aeiou";
        if(vowel.indexOf(word.charAt(0))!=-1 && vowel.indexOf(word.charAt(word.length()-1))!=-1)return true;
    return false;
    }
}