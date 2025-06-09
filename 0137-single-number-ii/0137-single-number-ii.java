class Solution {
   public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.replace(nums[i],count,count+1);
                continue;
            }
            map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%3!=0){
                return entry.getKey();
            }
        }
        return 0;
    }
}