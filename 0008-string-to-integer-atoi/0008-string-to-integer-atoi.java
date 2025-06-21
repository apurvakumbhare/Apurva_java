class Solution {
    
         public int myAtoi(String s) {
    if (s == null || s.isEmpty()) return 0;

    s = s.trim();
    if (s.isEmpty()) return 0;

    int i = 0;
    int sign = 1;

    if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    } else if (s.charAt(i) == '+') {
        i++;
    }

    int result = 0;

    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';

        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }

    return result * sign;
}

}