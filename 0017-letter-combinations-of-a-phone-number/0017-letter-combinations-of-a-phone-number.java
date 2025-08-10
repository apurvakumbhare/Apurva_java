class Solution {
    public List<String> letterCombinations(String digits) {
    String[] letters={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     if (digits == null || digits.length() == 0) {
            return new ArrayList<>(); // return empty list if no digits
        }
    return letterCombinations(digits,letters,"");
    }

    private List<String> letterCombinations(String digits, String[] letters,String processed) {
        if(digits.length()==0){
            List<String> ans=new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        List<String> ans=new ArrayList<>();
        int n=digits.charAt(0)-'0';
        String letter=letters[n-2];
        for (int i = 0; i < letter.length(); i++) {
            ans.addAll(letterCombinations(digits.substring(1),letters,processed+letter.charAt(i)));
        }
        return ans;
    }
}