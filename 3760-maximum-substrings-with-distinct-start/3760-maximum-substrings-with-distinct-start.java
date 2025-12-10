class Solution {
   public int maxDistinct(String s) {
        Set<Character> character = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            character.add(s.charAt(i));
        }
        return character.size();
    }
}