class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit; // Even index (leftmost is index 0) -> Positive sign
            } else {
                sum -= digit; // Odd index -> Negative sign
            }
        }
        return sum;
    }
}