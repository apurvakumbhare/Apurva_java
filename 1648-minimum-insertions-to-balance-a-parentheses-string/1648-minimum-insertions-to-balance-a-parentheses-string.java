import java.util.Stack;

class Solution {
    public int minInsertions(String s) {
        int count = 0; // Insertions needed
        int open = 0;  // Count of unmatched '('

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++; // Track unmatched '('
            } else { // When we encounter ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; // Move to the next ')'
                } else {
                    count++; // We need one more ')' to complete a pair
                }

                if (open > 0) {
                    open--; // Match one '('
                } else {
                    count++; // If no '(' available, insert one '('
                }
            }
        }

        // If any unmatched '(' remain, we need 2 insertions per '('
        count += open * 2;

        return count;
    }
}
