class Solution {
      public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> solutionList = new ArrayList<>();

        
            HashSet<Integer> visited = new HashSet<>();
        stack.add(source);
        visited.add(source);
            while (!stack.isEmpty()) {
                int current = stack.pop();
                solutionList.add(current);
                ArrayList<Integer> list = map.get(current);

                for (int i = 0; i < list.size(); i++) {
                    int next = list.get(i);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        stack.add(next);
                    }

                }
            }
            return visited.contains(destination);
    }
}