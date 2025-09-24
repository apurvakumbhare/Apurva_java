class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[baskets.length];

        for (int i = 0; i < fruits.length; i++) {
            int j = 0;
            while (j < baskets.length && (used[j] || baskets[j] < fruits[i])) {
                j++;
            }
            if (j < baskets.length && baskets[j] >= fruits[i]) {
                used[j] = true;
                n--;            
            }
        }
        return n;
    }
}
