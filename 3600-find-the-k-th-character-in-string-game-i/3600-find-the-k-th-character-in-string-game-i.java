class Solution {
     
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder("a");
    while(word.length()<k){
        word.append(opposite(word));
    }
    return word.charAt(k-1);
    }

    private char[] opposite(StringBuilder word) {
        char[] ans=new char[word.length()];
        for (int i = 0; i < ans.length; i++) {
            if(word.charAt(i)=='z')ans[i]='a';
            else ans[i]=(char) (word.charAt(i)+1);
        }
        return ans;
    }
}