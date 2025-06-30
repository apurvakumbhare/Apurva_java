class Solution {
  public char findKthBit(int n, int k) {
        String num=formANumber(n);
        int i=0;
        int ans=Character.getNumericValue(num.charAt(k-1))&1;
        return (ans==1)?'1':'0';
    }

   private String formANumber(int n) {
      if(n==0){
          return "";
      }
        if(n==1){
            return "0";
        }
        StringBuilder num=new StringBuilder();
        String Sn_1=formANumber(n-1);
        num.append(Sn_1);
        num.append(1);
        for (int i =Sn_1.length()-1 ; i>=0 ; i--) {
            int a=Character.getNumericValue(Sn_1.charAt(i));
            num.append((a==0)?1:0);
        }
        return num.toString();
    }
}