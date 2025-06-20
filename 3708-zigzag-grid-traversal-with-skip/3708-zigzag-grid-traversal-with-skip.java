class Solution {
   public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans=new ArrayList<>();
        boolean zigzag=false;
        for (int i = 0; i < grid.length; i++) {
            if(!zigzag){
                for (int j = 0; j < grid[i].length; j+=2) {
                   ans.add(grid[i][j]);
                }
            }
            else{
                 int start = (grid[i].length % 2 == 0) ? grid[i].length - 1 : grid[i].length - 2;
                for (int j = start; j >= 0; j-=2) {
                    ans.add(grid[i][j]);
                }
            }
            zigzag=!zigzag;
        }
        return ans;
    }

}