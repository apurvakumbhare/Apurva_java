class Solution {
       public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(nums[i])){
               int old=map.get(nums[i]);
               map.replace(nums[i],old,old+1);
           }
           else{
               map.put(nums[i],1);
           }
        }
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==nums.length/2){
                result=entry.getKey();
            }
        }
        return result;
    }
}