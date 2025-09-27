class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0.0;
        for (int i = 0; i < n; ++i) {
            for (int j = i+1; j < n; ++j) {
                for (int k = j+1; k < n; ++k) {
                    max = Math.max(max, area(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }

    private double area(int[] a, int[] b, int[] c) {
        long x1 = a[0], y1 = a[1];
        long x2 = b[0], y2 = b[1];
        long x3 = c[0], y3 = c[1];
        return Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0;
    }
}
