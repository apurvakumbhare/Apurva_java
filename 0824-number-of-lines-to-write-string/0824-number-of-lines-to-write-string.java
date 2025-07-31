class Solution {
  public static int[] numberOfLines(int[] widths, String s) {
    int sum=0;
    int [] result=new int[2];
       int lines=0;
    for (int i = 0; i < s.length(); i++) {
        int w = widths[s.charAt(i) - 'a'];
        if (sum + w > 100) {
            lines++;
            sum = w;
        } else {
            sum += w;
        }
    }
    result[0]=lines+1;
    result[1]=sum;
    return result;
    }
}