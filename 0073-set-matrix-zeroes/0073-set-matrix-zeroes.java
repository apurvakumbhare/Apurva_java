class Solution {
     public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
            Set<Integer> col=new HashSet<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j <matrix[i].length; j++) {
                    if (matrix[i][j]==0){
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            for (int a:row) {
                for (int i = 0; i <matrix[a].length ; i++) {
                    matrix[a][i]=0;
                }
            }
            for (int a:col) {
                for (int i = 0; i <matrix.length ; i++) {
                    matrix[i][a]=0;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }

        }
}