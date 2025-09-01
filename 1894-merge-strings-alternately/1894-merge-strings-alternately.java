class Solution {
    public String mergeAlternately(String word1, String word2) {
    if(word1.length()==0)return word2;
        if(word2.length()==0)return word1;
        int i=0 ,j=0;
        StringBuilder builder=new StringBuilder();
        while (i<word1.length() && j<word2.length()){
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){builder.append(word1.charAt(i));
        i++;}
        while(j<word2.length()){builder.append(word2.charAt(j));
        j++;}
        return builder.toString();
    }
}