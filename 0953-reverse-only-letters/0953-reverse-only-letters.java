class Solution {
       public String reverseOnlyLetters(String s) {
        StringBuilder builder=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        char temp;
        while(i<j){
            if(!((builder.charAt(i)>='a' && builder.charAt(i)<='z' ) || (builder.charAt(i)>='A' && builder.charAt(i)<='Z' )) ){
                i++;
                continue;
            }
            if(!((builder.charAt(j)>='a' && builder.charAt(j)<='z' ) ||(builder.charAt(j)>='A' && builder.charAt(j)<='Z' )) ){
                j--;
                continue;
            }
            temp=builder.charAt(j);
            builder.setCharAt(j,builder.charAt(i));
            builder.setCharAt(i,temp);
            i++;
            j--;
        }
        return builder.toString();
    }
}