class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");  // Trim spaces and split by whitespace
        return words[words.length - 1].length();
    }
}