class Solution {
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