class Solution {
  public boolean containsNearbyDuplicate(int[] arr, int k) {
     Set<Integer> s=new HashSet<>();
      for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])){
                return true;
            }
            s.add(arr[i]);
            if(s.size()>k){
                s.remove(arr[i-k]);
            }
        }
        return false;
    }
}