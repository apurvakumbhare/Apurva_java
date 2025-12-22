class Solution {
     public int[][] kClosest(int[][] nums, int k) {
    PriorityQueue<int[]>  maxheap=new PriorityQueue<>((x,y)->Integer.compare((y[0]*y[0]+y[1]*y[1]),(x[0]*x[0]+x[1]*x[1])));

        for (int i = 0; i < nums.length; i++) {
                maxheap.add(nums[i]);
                if(maxheap.size()>k){
                    maxheap.poll();
                }
            }
        int[][] ans=new int[k][];
        int i=0;
        while (!maxheap.isEmpty()){
            ans[i++]= maxheap.poll();
        }
        return ans;
    }
}