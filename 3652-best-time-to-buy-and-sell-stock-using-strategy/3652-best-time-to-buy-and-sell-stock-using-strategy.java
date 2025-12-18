// //BruteForce
// class Solution {
//       public long maxProfit(int[] prices, int[] strategy, int k) {
//     int Max=0;
//         for (int i = 0; i < prices.length; i++) {
//             Max+=prices[i]*strategy[i];
//         }
//     int i=0, j=i+k-1;
//     while(j< prices.length){
//         int CurSum=0;
//       int toZero=(i+j)/2;
//         for (int l = 0; l <i; l++) {
//             CurSum+= prices[l]*strategy[l];
//         }
//         for (int l = toZero+1; l <=j; l++) {
//             CurSum+= prices[l];
//         }
//         for (int l = j+1; l < prices.length; l++) {
//            CurSum+= prices[l]*strategy[l];
//         }

//         Max=(Max>CurSum)?Max:CurSum;
//         i++;
//         j++;
//     }
//     return Max;
//     }
// }
// Optimal
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        long[] prefBase = new long[n + 1];
        long[] prefPrice = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefBase[i + 1] = prefBase[i] + (long) prices[i] * strategy[i];
            prefPrice[i + 1] = prefPrice[i] + prices[i];
        }

        long baseProfit = prefBase[n];
        long maxProfit = baseProfit;

        for (int i = 0; i + k <= n; i++) {
            int j = i + k - 1;
            int mid = (i + j) / 2;
            long removeWindow = prefBase[j + 1] - prefBase[i];
long addSecondHalf = prefPrice[j + 1] - prefPrice[mid + 1];

            long curProfit = baseProfit - removeWindow + addSecondHalf;
            maxProfit = Math.max(maxProfit, curProfit);
        }

        return maxProfit;
    }
}

