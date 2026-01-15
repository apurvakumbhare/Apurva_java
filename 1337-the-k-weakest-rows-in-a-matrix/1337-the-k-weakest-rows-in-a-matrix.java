class Solution {
   public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue=new PriorityQueue<>((x,y)->{
            if(x[1]!=y[1]){
                return x[1]-y[1];
            }
            else return x[0]-y[0];
        });

        for (int i = 0; i <mat.length ; i++) {
            int count=0;
            for (int j = 0; j < mat[1].length; j++) {
                if(mat[i][j]==1)count++;
            }
            queue.add(new int[]{i,count});
         
        }
        int[] result=new int[k];
        int i=0;
        while(i< k && !queue.isEmpty()){
            result[i++]=queue.poll()[0];
        }
        return result;
    }
}