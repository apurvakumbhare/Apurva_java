class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] answer=new int[n][n];
        int i=0,j=0;
        int num=1;
        boolean right=true, left=false,up=false,down=false;
        while(num<=n*n){
            while(right && j<n && answer[i][j]==0 ){
                answer[i][j++]=num++;

            }
            j--;            // step back inside
            i++;  down=!down;right=!right;
            while(down  && i<n && answer[i][j]==0){
                answer[i++][j]=num++;
            }
            i--;
            j--;     down=!down;left=!left;
            while(left  && j>=0 && answer[i][j]==0){
                answer[i][j--]=num++;
            }
            j++;
            i--;
            left=!left;up=!up;
            while(up  && i>=0 && answer[i][j]==0){
                answer[i--][j]=num++;
            }
            i++;
            j++;
            up = !up;
            right =!right;
        }
        return answer;

    }
}