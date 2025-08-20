class Solution {

    public static List<String> generateParenthesis(int n) {
    if(n==0)return new ArrayList<>();
       return generateParenthesis(n,n,"");
    }

    private static List<String> generateParenthesis(int open,int close, String s) {
        if(open==0 && close==0){
            List<String> temp= new ArrayList<>();
            temp.add(s);
            return temp;
        }

        List<String> ans= new ArrayList<>();
        if (open > 0)ans.addAll(generateParenthesis(open-1,close,s+'('));
        if (close > open) ans.addAll(generateParenthesis(open,close-1,s+')'));
        return ans;
    }
}