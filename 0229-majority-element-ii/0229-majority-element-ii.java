class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> l=new ArrayList<>();
HashMap<Integer,Integer> h=new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if(h.containsKey(nums[i])){
            int old=h.get(nums[i]);
            h.replace(nums[i],old,old+1);
            continue;
        }
        h.put(nums[i],1);
    }
    for(Map.Entry<Integer,Integer> entry:h.entrySet()){
        if(nums.length/3<entry.getValue()){
            l.add(entry.getKey());
        }
    }
    return l;
}
}