class Solution {
      public int trap(int[] height) {
int[] left=nextgreaterleft(height);
int[] right=nextgreaterright(height);
int sum=0;
        for (int i = 0; i < height.length ; i++) {
            sum+=Math.max(Math.min(left[i],right[i])-height[i],0);
        }
        return sum;
    }

    public static  int[] nextgreaterleft(int[] head) {
int[] result=new int[head.length];
result[0]=head[0];
        for (int i = 1; i < head.length; i++) {
            result[i]=Math.max(result[i-1],head[i]);
        }
        return result;
    }
    public static  int[] nextgreaterright(int[] head) {
        int[] result=new int[head.length];
        result[head.length-1]=head[head.length-1];
        for (int i = head.length-2; i >=0; i--) {
            result[i]=Math.max(result[i+1],head[i]);
        }
        return result;
    }
}