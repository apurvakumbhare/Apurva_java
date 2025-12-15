class Solution {
public long getDescentPeriods(int[] prices) {
    long count= prices.length;
    int x=1;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]==prices[i-1]-1){
                x++;
            }else{
                if(x>1){
                   count += (long)x * (x - 1) / 2;}
                x=1;
            }
        }
          if(x>1){
                    count +=(long) x * (x - 1) / 2; }
        return count;
    }
}