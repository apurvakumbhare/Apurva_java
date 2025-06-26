class Solution {
  public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int old=map.get(nums[i]);
                map.replace(nums[i],old,old+1);
            }else{
                map.put(nums[i],0);
            }
        }
        PriorityQueue<Integer>  pq=new PriorityQueue<>(Collections.reverseOrder((x,y)->Integer.compare(map.get(x),map.get(y))));

   for(Map.Entry<Integer,Integer> entry:map.entrySet()){
       pq.add(entry.getKey());
   }
   List<Integer> ans=new ArrayList<>();
   int count=1;
   while(count<=k){
       count++;
       ans.add(pq.remove());
   }
   return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}