class Solution {
    public int commonFactors(int a, int b) {
    int min=(a<b)?a:b;
    int max=(a>b)?a:b;
    int count=0;
        for (int i = 1; i <=min/2 ; i++) {
            if(a%i==0 && b%i==0)count++;
        }
        if(max%min==0)count++;
        return count;
    }
}