class Solution {
   public boolean hasSameDigits(String s) {
        if(s.length()<=1) return false;
        StringBuilder sb=new StringBuilder();
    while(s.length()>2){
          sb.setLength(0);
        for (int i = 0; i <s.length()-1 ; i++) {
            sb.append(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
        }
        
        s=sb.toString();
     
    }
  return s.charAt(0)==s.charAt(1);
    }
}