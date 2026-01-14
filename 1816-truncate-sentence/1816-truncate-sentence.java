class Solution {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<k;i++){
            builder.append(words[i]);
            if(i!=k-1){
                builder.append(" "); 
            }
        }
        return builder.toString();
    }
}