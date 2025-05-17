class Solution {
    public int numberOfSteps(int num) {
        return prints(num,0);
    }
    private static int  prints(int n,int count){
        if(n<=0){
            return count;
        }

        if(n%2==0){
            return prints(n/2,count+1);
        }
        else {
            return prints(n-1,count+1);
        }
    }
}