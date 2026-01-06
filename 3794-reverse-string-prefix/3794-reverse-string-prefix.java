class Solution {
    public String reversePrefix(String s, int k) {
        int i=0,j=k-1;
        StringBuilder builder=new StringBuilder(s);
        while(i<j){
            char temp=builder.charAt(i);
            builder.setCharAt(i,builder.charAt(j));
            builder.setCharAt(j,temp);
            i++;
            j--;
        }
        return builder.toString();
    }
}