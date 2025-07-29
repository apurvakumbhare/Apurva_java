class Solution {
    public boolean checkDivisibility(int n) {
        int ori=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int a=n%10;
            sum+=a;
            mul*=a;
            n=n/10;
        }
        int result=sum+mul;
        return ori%result==0;
    }
}