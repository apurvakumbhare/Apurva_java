class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(isPresent(words[i])){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }

    private boolean isPresent(String word) {
        String A="qwertyuiop";
        String B="asdfghjkl";
        String C="zxcvbnm";
        word = word.toLowerCase();
        if(A.indexOf(word.charAt(0))!=-1) {
            for (int i = 0; i < word.length(); i++) {
                if (A.indexOf(word.charAt(i))==-1)return false;
            }
        }else if(B.indexOf(word.charAt(0))!=-1){
            for (int i = 0; i < word.length(); i++) {
                if (B.indexOf(word.charAt(i))==-1)return false;
            }  
        }
        else{
            for (int i = 0; i < word.length(); i++) {
                if (C.indexOf(word.charAt(i))==-1)return false;
            }
        }
        return true;
    }
}