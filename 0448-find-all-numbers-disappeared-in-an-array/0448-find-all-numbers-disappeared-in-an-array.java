class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
         cyclic_sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }

   static void cyclic_sort(int[] a){
        int i=0;
        while(i<a.length ) {
            int c=a[i]-1;
            if( c<a.length  && a[i]!=a[c] ){
                    int temp=a[i];
                    a[i]=a[c];
                    a[c]=temp;
                }
                else{
                    i++;
                }
        }

    }
}