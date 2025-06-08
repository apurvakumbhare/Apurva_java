class Solution {
   public int[] countBits(int n) {
        int[] answer=new int[n+1];
        for (int i = 0; i <=n; i++) {
           int bit=0;
           int num=i;
           while (num>0){
               bit=((num&1)==1)? bit+=1:bit;
               num=num>>1;
           }
           answer[i]=bit;
        }
        return answer;
    }
}