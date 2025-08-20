class Solution {
    public static String longestPalindrome(String a) {
        String b = new StringBuilder(a).reverse().toString();
        if (a.length() == 0) return "";
        int[][] dp = new int[a.length() + 1][a.length() + 1];
        int max = 0;  
        int end = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    int startInA = i - dp[i][j];
                    int startInOriginal = a.length() - j;

                    if (startInA == startInOriginal && dp[i][j] > max) {
                        max = dp[i][j];
                        end = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        if (max == 0) return a.substring(0, 1);
        return a.substring(end - max, end);
    }
}

