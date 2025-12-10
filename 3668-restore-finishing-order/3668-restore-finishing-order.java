class Solution {
   public int[] recoverOrder(int[] order, int[] friends) {
        int[] finishing_order=new int[friends.length];
        Set<Integer> set=new HashSet<>();
   
    for (int f : friends) {
        set.add(f);
    }
        int j=0;
        for (int i = 0; i < order.length; i++) {
            if(set.contains(order[i]))finishing_order[j++]=order[i];
        }
        return finishing_order;
    }
}