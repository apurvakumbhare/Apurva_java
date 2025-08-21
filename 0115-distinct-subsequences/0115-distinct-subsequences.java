// class Solution {
//     //Recurssive
//         Map<String, Integer> memo = new HashMap<>();

//         public int numDistinct(String s, String t) {
//             if (s.length() == 0) return 0;
//             return numDistinct(s, t, "");
//         }

//         private int numDistinct(String s, String t, String p) {
//             if (p.equals(t)) return 1; 
//             if (s.length() == 0) return 0; 

//             String key = s + "|" + p;    
//             if (memo.containsKey(key)) return memo.get(key);

//             int count = 0;
//             count += numDistinct(s.substring(1), t, p + s.charAt(0));
//             count += numDistinct(s.substring(1), t, p);

//             memo.put(key, count);
//             return count;
//         }
    
//     }
    import java.util.*;

class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(s, t, 0, 0, dp);
    }

    private int helper(String s, String t, int i, int j, int[][] dp) {
        if (j == t.length()) return 1;  // matched full t
        if (i == s.length()) return 0;  // ran out of s

        if (dp[i][j] != -1) return dp[i][j];

        int ways = helper(s, t, i + 1, j, dp); // skip
        if (s.charAt(i) == t.charAt(j)) {
            ways += helper(s, t, i + 1, j + 1, dp); // take
        }

        return dp[i][j] = ways;
    }
}
