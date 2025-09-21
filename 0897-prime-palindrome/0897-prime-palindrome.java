class Solution {
   public int primePalindrome(int n) {
    
    while(!isPrime(n) || !ispalindrome(n)){
        n++;
            if (10000000 < n && n < 100000000) {
            n = 100000000;
        }
    }
     return n;   
    }

    boolean isPrime(int n){
      if(n < 2) return false;      
       if(n == 2) return true;     
       if(n % 2 == 0) return false; 
       for (int i = 3; i * i <= n; i += 2) {
    if(n % i == 0) return false;
}
        return  true;
    }
    boolean ispalindrome(int n){
        int ori=n;
        if(n<10)return true;
        int a;
        int reverse=0;
        while(n>0){
            a=n%10;
            reverse=(reverse*10)+a;
            n=n/10;
        }
        return ori== reverse;
    }
}