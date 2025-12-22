class Solution {
   class pair{
    int key; int val;
        public pair(int key, int val){
            this.key=key;
            this.val=val;
        }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer=new ArrayList<>(); 
PriorityQueue<pair> queue =new PriorityQueue<>(
        (a,b)->{if(b.key!= a.key) return Integer.compare(b.key, a.key);
            else return Integer.compare(b.val, a.val);
});
        for (int i = 0; i < arr.length; i++) {
            queue.add(new pair(Math.abs(x-arr[i]),arr[i]));
            if(queue.size()>k){
                queue.poll();
            }
        }
       
        while (!queue.isEmpty()){
            answer.add(queue.poll().val);
        }
      Collections.sort(answer);
        return answer;
     }
}