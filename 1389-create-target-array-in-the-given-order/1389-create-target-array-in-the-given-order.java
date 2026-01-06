class Solution {
   public static  int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        int last=0;
        for(int i=0;i<nums.length;i++){
            
                int j=nums.length-2;
                while(j>=index[i]){
                    target[j+1]=target[j];
                    System.out.println(Arrays.toString(target));
                    j--;

                }
                last++;
                target[index[i]]=nums[i];
            
        }
        return target;
    }
}