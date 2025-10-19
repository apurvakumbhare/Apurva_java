class Solution {
        public int[] minOperations(String boxes) {
int[] ans=new int[boxes.length()];
int op;
        int j;
        for (int i = 0; i < ans.length; i++) {
            op=0;
            j=0;
            while(j<boxes.length()   ){
              if(boxes.charAt(j)=='1')  op+=Math.abs(i-j);
                j++;
            }
            ans[i]=op;
        }
        return ans;
    }
}