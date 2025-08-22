class Solution {
 public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;
int[] dp=new int[s.length()+1];
int start=0;
int end=1;
dp[end]=1;
int max = s.length() > 0 ? 1 : 0;
        for (int i = 2; i <dp.length ; i++) {
            if(s.substring(start,end).contains(String.valueOf(s.charAt(i - 1)))){
               
               start = s.indexOf(s.charAt(i - 1), start) + 1;
                 dp[i]=i-start;
            }
            else {
                dp[i]=dp[i-1]+1;
            
            }
             end = i;
            max=Math.max(max,dp[i]);
        }
        return max ;
    }
}