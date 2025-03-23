class Solution {
    public int missingNumber(int[] nums) {
        cyclic_sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
     static void cyclic_sort(int[] a){
        int i=0;
        while(i<a.length ) {
            int c=a[i];
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