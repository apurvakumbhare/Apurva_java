class Solution {
   public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],i);
        }
        ArrayList<Integer> extra =new ArrayList<>();
        int[] count=new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                count[map.get(arr1[i])]++;
            }else{
                extra.add(arr1[i]);
            }
        }
        int i = 0;
        int j =0;
        while(i < arr1.length && j<arr2.length) {
            while(count[j]>0){
                arr1[i++]=arr2[j];
                count[j]--;
            }
            j++;
        }
        Collections.sort(extra);       
        for (int num : extra) {     
            arr1[i++] = num;
        }
        return arr1;
    }
}