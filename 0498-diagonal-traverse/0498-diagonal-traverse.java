class Solution {
  public int[] findDiagonalOrder(int[][] mat) {
    int m = mat.length, n = mat[0].length;
    boolean up=true;
    int i=0;
    int j=0;
        int[] ans=new int[mat.length*mat[0].length];
        int k=0;
   while(k <mat.length*mat[0].length){
        ans[k]=mat[i][j];
        if (up) {
                if (j == n - 1) { 
                    i++;
                    up = false;
                } else if (i == 0) {
                    j++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else { 
                if (i == m - 1) {
                    j++;
                    up = true;
                } else if (j == 0) { 
                    i++;
                    up = true;
                } else {
                    i++;
                    j--;
                }
       
    }
 k++;
    }
        return ans;
  }
}