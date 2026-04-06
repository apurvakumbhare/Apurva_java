class Solution {
      public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] degree=new int[numCourses];
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for (int[] i :prerequisites) {
            int a=i[0];
            int b=i[1];
            degree[a]++;
            map.putIfAbsent(a,new ArrayList<>());
            map.putIfAbsent(b,new ArrayList<>());
            map.get(b).add(a);
        }
        return findOrder(map,degree);
    }

    private int[] findOrder(HashMap<Integer, ArrayList<Integer>> map, int[] degree) {
        ArrayList<Integer> list=new ArrayList<>();

        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < degree.length; i++) {
            if(degree[i]==0)queue.add(i);
        }
        while(!queue.isEmpty()){
            int current=queue.remove();
            list.add(current);
            ArrayList<Integer> sublist=map.get(current);
            if(sublist!=null) {
                for (int i : sublist) {
                    degree[i]--;
                    if (degree[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }
        if(list.size() != degree.length) {
    return new int[0]; 
}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}