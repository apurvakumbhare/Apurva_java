class Solution {
      public char findTheDifference(String s, String t) {
        int[] list = new int[26];
        for (int i = 0; i < s.length(); i++) {
            list[(int) (s.charAt(i) - 'a')] += 1;
           
        }
        for (int i = 0; i < t.length(); i++) {
            list[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
            return (char)('a'+i);
            }
        }
        return '?';
    }
}