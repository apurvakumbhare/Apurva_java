class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        int n = words.length;

        HashSet<Character>[] charSets = new HashSet[n];
        for (int i = 0; i < n; i++) {
            charSets[i] = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                charSets[i].add(c);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!hasCommonChar(charSets[i], charSets[j])) {
                    int product = words[i].length() * words[j].length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }

    private boolean hasCommonChar(HashSet<Character> set1, HashSet<Character> set2) {
        for (char c : set1) {
            if (set2.contains(c)) {
                return true;
            }
        }
        return false;
    }
}
