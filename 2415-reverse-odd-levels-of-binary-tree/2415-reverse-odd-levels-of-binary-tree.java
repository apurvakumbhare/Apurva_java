class Solution {
    public TreeNode reverseOddLevels(TreeNode node) {
        if (node == null) {
            return node;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int level = 0; 
        while (!q.isEmpty()) {
            int size = q.size();
            List<TreeNode> currLevel = new ArrayList<>(); 

            for (int i = 0; i < size; i++) {
                TreeNode CurrentNode = q.remove();
                currLevel.add(CurrentNode); 

                if (CurrentNode.left != null) {
                    q.add(CurrentNode.left);
                }
                if (CurrentNode.right != null) {
                    q.add(CurrentNode.right);
                }
            }

            if (level % 2 == 1) {
                int i = 0, j = currLevel.size() - 1;
                while (i < j) {
                    int temp = currLevel.get(i).val;
                    currLevel.get(i).val = currLevel.get(j).val;
                    currLevel.get(j).val = temp;
                    i++;
                    j--;
                }
            }

            level++; 
        }
        return node;
    }
}
