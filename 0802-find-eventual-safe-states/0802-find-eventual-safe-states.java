class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for (int i=0;i<graph.length;i++) {
            map.putIfAbsent(i,new ArrayList<>());
            for(int j: graph[i]){
                     map.get(i).add(j);
            }
        }
        int[] isSafe=new int[map.size()];
        for (int i = 0; i < isSafe.length; i++) {
            if(isSafe[i]==0)eventualSafeNodes(isSafe,map,i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            if(isSafe[i]==2)list.add(i);
        }
        return list;
    }

    private boolean eventualSafeNodes(int[] isSafe,HashMap<Integer, ArrayList<Integer>> map, int i) {
    if(isSafe[i]==1)return false;
    if(isSafe[i]==2)return true;
    isSafe[i]=1;
    ArrayList<Integer> sublist=map.get(i);
    for(int ele:sublist){
       if(! eventualSafeNodes(isSafe,map,ele))return false;
    }
    isSafe[i]=2;
   return true;
   }
}