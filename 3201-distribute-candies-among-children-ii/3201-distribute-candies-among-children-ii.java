class Solution {
    public long distributeCandies(int n, int limit) {
        long total = combination(n + 2, 2);
        total -= 3 * combination(n - limit + 1, 2);
        total += 3 * combination(n - 2 * limit, 2);
        total -= combination(n - 3 * limit - 1, 2);
        return total;
    }

    private long combination(long n, int k) {
        if (k > n || n < 0) return 0;
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
