class Solution {
    public int secondHighest(String s) {
        s=s.trim();
        int i=0;
        int num1=-1;
        int num2=-1;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i)) && (s.charAt(i)-'0')>num1){
                num2=num1;
                num1=s.charAt(i)-'0';
            }
            if(Character.isDigit(s.charAt(i)) && (s.charAt(i)-'0')>num2 &&(s.charAt(i)-'0')<num1 )num2=s.charAt(i)-'0';
            i++;
        }
        return num2;
    }
}