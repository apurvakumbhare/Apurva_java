class Solution {
    public String reverseWords(String s) {
        String[] ori=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ori.length ; i++) {
         ori[i]= reverse(ori[i]);
         sb.append(ori[i]);
         if(i!= ori.length-1){
             sb.append(" ");
         }
        }
        return sb.toString();
    }
    String reverse(String s){
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            char temp=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=temp;
        }
        return new String(c);
    }
}