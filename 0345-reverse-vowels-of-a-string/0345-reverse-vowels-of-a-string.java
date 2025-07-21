class Solution {
     public String reverseVowels(String s) {
       char[] original=s.toCharArray();
        int st=0;
        int en=s.length()-1;
        while(st<en) {
            while (!is_vowel(original[st]) && st<en) {
                st++;
            }
            while (!is_vowel(original[en]) && st<en) {                en--;
            }
            char temp = original[st];
            original[st] = original[en];
            original[en] = temp;

                st++;
                en--;

        }

        return new String(original);
    }
    boolean is_vowel(char a){
      return "AEIOUaeiou".indexOf(a)!=-1;
    }
}