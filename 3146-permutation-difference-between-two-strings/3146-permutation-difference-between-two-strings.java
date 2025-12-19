class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] occurrence =new int[26];
        for (int i = 0; i <s.length() ; i++) {
            occurrence[s.charAt(i)-'a']=(occurrence[s.charAt(i)-'a']!=0)?Math.abs(occurrence[s.charAt(i)-'a']-i):i;
            occurrence[t.charAt(i)-'a']=(occurrence[t.charAt(i)-'a']!=0)?Math.abs(occurrence[t.charAt(i)-'a']-i):i;
        }
        int sum=0;
        for (int i = 0; i <26 ; i++) {
           sum+=occurrence[i];      }
        return sum;
    }
}