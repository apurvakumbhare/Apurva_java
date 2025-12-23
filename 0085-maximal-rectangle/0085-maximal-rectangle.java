class Solution {
   public int maximalRectangle(char[][] matrix) {
        int[] prev=new int[matrix[0].length];
        int max=0;
        for (int i = 0; i <matrix.length ; i++) {
            if(i!=0) {
                int[] next=new int[matrix[0].length];
                for (int j = 0; j < matrix[i].length; j++) {
                next[j]=(matrix[i][j]=='1')?prev[j]+Character.getNumericValue(matrix[i][j]):0;
                }
                max=Math.max(max,largestRectangleArea(next));
                prev=next;
            }else{
                for (int j = 0; j < matrix[i].length; j++) {
                    prev[j]=(matrix[i][j]=='1')?1:0;
                }
                max=Math.max(max,largestRectangleArea(prev));
                
            }
        }
        return max;
    }
    public int largestRectangleArea(int[] heights) {
        int[] left=nextsmallererleft(heights);
        int[] right=nextsmallererright(heights);
        int max=0;
        for (int i = 0; i < heights.length; i++) {
            int ans=heights[i]*(right[i]-left[i]-1);
            max=(ans>max)?ans:max;
            
        }
        return max;
    }
    public static  int[] nextsmallererleft(int[] head) {
        int[] result =new int[head.length];
        Stack<int[]> stack=new Stack<>();
        for (int i =0; i < head.length ; i++) {

            while(!stack.isEmpty() &&stack.peek()[0]>=head[i]){
                stack.pop();
            }

            result[i]=(!stack.isEmpty())?stack.peek()[1]:-1;
            stack.push(new int[]{head[i],i});

        }
        return result;
    }
    public static  int[] nextsmallererright(int[] head) {
        int[] result =new int[head.length];
        Stack<int[]> stack=new Stack<>();
        for (int i =head.length-1; i >= 0 ; i--) {

            while(!stack.isEmpty() &&stack.peek()[0]>=head[i]){
                stack.pop();
            }

            result[i]=(!stack.isEmpty())?stack.peek()[1]:head.length;
            stack.push(new int[]{head[i],i});

        }
        return result;
    }
}