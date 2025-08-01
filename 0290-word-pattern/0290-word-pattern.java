class Solution {
    public boolean wordPattern(String pattern, String s) {
    s = s.trim();
    String[] str = s.split("\\s+");

    if (pattern.length() != str.length) return false;

    HashMap<Character, String> map = new HashMap<>();
    HashMap<String, Character> reverseMap = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
        char c = pattern.charAt(i);
        String word = str[i];

        if (map.containsKey(c)) {
            if (!map.get(c).equals(word)) return false;
        } else {
            if (reverseMap.containsKey(word)) return false;
            map.put(c, word);
            reverseMap.put(word, c);
        }
    }

    return true;
}

}