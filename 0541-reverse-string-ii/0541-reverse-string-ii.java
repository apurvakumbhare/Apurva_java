class Solution {
     public String reverseStr(String s, int k) {
        int i =0,j=i+k-1;
        StringBuilder builder=new StringBuilder(s);
        while(i<s.length()){
            j = Math.min(i + k - 1, s.length() - 1);
            reverse(builder,i,j);
            i+=2*k;
         
        }
        return builder.toString();
    }
    public void reverse(StringBuilder builder, int i,int j ) {
        char temp;
        while(i<j){
            temp=builder.charAt(j);
            builder.setCharAt(j,builder.charAt(i));
            builder.setCharAt(i,temp);
            i++;
            j--;
        }
    }
}