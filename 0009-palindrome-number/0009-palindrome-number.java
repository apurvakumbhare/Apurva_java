class Solution {
    public boolean isPalindrome(int x) {
     int n=x;
        int reverse=0;
        while(n>0){
           int a=n%10;
            reverse=reverse*10+a;
            n=n/10;
        }
     return x==reverse;
    }
}