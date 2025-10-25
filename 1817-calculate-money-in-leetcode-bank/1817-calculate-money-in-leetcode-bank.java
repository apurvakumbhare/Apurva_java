
class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static int totalMoney(int n) {
        if (map.containsKey(n)) return map.get(n);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
         
            int add = (i - 1) / 7;
            sum += ((i - 1) % 7) + add + 1;

            map.put(i, sum); 
        }
        return sum;
    }
}

