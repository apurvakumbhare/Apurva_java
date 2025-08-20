class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//        boolean[][] dp=new  boolean[s.length()][s.length()];
//    return  wordBreak(dp,s,wordDict,0,s.length()-1);
//     }
//     boolean wordBreak(  boolean[][] dp,String s, List<String> wordDict,int i,int j){
//         if(i>j)return false;

//            if(wordDict.contains(s.substring(i,j+1)))return true;
//         if(dp[i][j]!=false){
//             return dp[i][j];
//         }
//         for (int k = i; k <j ; k++) {
//             if (wordBreak(dp,s, wordDict, i, k) && wordBreak(dp,s, wordDict, k + 1, j)) {
//                 return dp[i][j]=true;
//             }
//         }
//         return false;
//     }

//topdown
public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; 

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}