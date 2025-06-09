class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
    HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.replace(nums[i],count,count+1);
                continue;
            }
            map.put(nums[i],1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0 && i<2){
               ans[i]=entry.getKey();
                i++;
            }

        }
        return ans;
    }
}