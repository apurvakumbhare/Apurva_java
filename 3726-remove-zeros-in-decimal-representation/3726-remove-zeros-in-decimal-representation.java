class Solution {
 public long removeZeros(long n) {
        long p=1;
        long result=0;
        while(n>0){
           long digit = n % 10;
if (digit != 0) {
    result += digit * p;
    p *= 10;
}
n/=10;
        }
       

        return result;
    }
    
}