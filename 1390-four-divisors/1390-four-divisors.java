class Solution {
    public int sumFourDivisors(int[] nums) {
        int resultantSum=0;

        for(int i=0;i<nums.length;i++){
            int count=0;
              int sum=0;
                for(int j =1;nums[i]>=j*j;j++){
                    if(nums[i]%j==0){
                        if(nums[i]/j!=j){
                        count+=2;
                        sum+=j;
                        sum+=nums[i]/j;
                    }else{
                        count+=1;
                        sum=j;
                    }
                }
                }
                
                if(count==4){
                    resultantSum+=sum;
                }
        }
        return resultantSum;
    }
}