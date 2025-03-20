class Solution {
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            s=sq(s);
            f=sq(sq(f));
        }while(s!=f);
        if(s==1){
            return true;
        }
        return false;
    }
    public int sq(int n){
        int sum=0;
            while(n>0){
               int a=n%10;
               sum+=a*a;
               n/=10;
            }
            return sum;
    }
}