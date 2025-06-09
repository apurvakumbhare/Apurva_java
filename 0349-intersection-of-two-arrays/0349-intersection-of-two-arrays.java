class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer> a=new ArrayList<>();
    HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if(h.contains(nums1[i])){
                continue;
            }
            h.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(h.contains(nums2[i]) && a.contains(nums2[i])){
                continue;
            }
          if(h.contains(nums2[i]) ){
              a.add(nums2[i]);
          }
        }

        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}