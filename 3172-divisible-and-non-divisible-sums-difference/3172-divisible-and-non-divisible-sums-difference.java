class Solution {
     public int differenceOfSums(int n, int m) {
        int divisiblesum=0;
        int nondivisiblesum=0;
        for (int i = 1; i <= n; i++) {
            if(i%m==0){
                divisiblesum+=i;
            }
            else{
                nondivisiblesum+=i;
            }
        }
        return  nondivisiblesum-divisiblesum;
    }
}