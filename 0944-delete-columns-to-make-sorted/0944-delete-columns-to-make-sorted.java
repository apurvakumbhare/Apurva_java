class Solution {
     public int minDeletionSize(String[] strs) {
        int count = 0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length()) {
                if (strs[i].charAt(j) < strs[i - 1].charAt(j) && !set.contains(j)) {
                    count++;
                    set.add(j);
                }
                j++;
            }
        }
        return count;
    }
}