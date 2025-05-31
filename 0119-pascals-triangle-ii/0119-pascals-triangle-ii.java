class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> a = new ArrayList<>();
            List<Integer> prev = (i == 0) ? null : list.get(i - 1);
            list.add(helper(i, a, prev));
        }

        return list.get(rowIndex);
    }

    private List<Integer> helper(int rowIndex, List<Integer> list, List<Integer> old) {
        if (rowIndex == 0 || old == null) {
            list.add(1);
            return list;
        }

        list.add(1);
        for (int i = 0; i < old.size() - 1; i++) {
            list.add(old.get(i) + old.get(i + 1));
        }
        list.add(1);

        return list;
    }
}
