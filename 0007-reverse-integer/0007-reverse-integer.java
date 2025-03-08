class Solution {
    public int reverse(int x) {
      int num=Math.abs(x);
      int reverse=0;
        while(num>0){
            int a=num%10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && a > 7)) 
                return 0; 
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && a < -8)) 
                return 0;
            
            reverse=reverse*10+a;
            num/=10;
        }
        if(x<0){
            reverse=-reverse;
        }
        return reverse;

  
    }
}