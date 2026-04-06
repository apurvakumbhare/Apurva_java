class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

    private boolean findOrder(HashMap<Integer, ArrayList<Integer>> map, int[] degree) {
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
        
        return list.size()==degree.length;
    }
}