class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
    int count = 1; 

    for (int i = 1; i < num.length(); i++) {
        if (num.charAt(i) == num.charAt(i - 1)) {
            count++;
            if (count == 3) {
                int digit = num.charAt(i) - '0';
                max = Math.max(max, digit);
            }
        } else {
            count = 1; 
        }
    }

    if (max == -1) return "";
    return "" + (char)('0' + max) + (char)('0' + max) + (char)('0' + max);
    }
}