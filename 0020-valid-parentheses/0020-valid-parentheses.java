import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // Push opening brackets to the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            // Check for matching closing brackets
            else {
                if (stack.isEmpty()) {
                    return false; // No opening bracket to match
                }

                char top = stack.pop();
                if ((current == ')' && top != '(') || 
                    (current == '}' && top != '{') || 
                    (current == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}