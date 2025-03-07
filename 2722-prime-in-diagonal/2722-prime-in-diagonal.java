class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
        if(isPrime(nums[i][i]) && nums[i][i]>max){
          
            max=nums[i][i];
          }
           if(isPrime(nums[i][nums.length - i - 1]) && nums[i][nums.length - i - 1]>max){
          
            max=nums[i][nums.length - i - 1];
          }
           
        }
        
        return max;
    }
    public static boolean isPrime(int a) {
        if(a<=1){
            return false;
        }
        else if(a==2){
            return true;
        }
        else{
            int b=2;
            while(b*b<=a){
                if(a%b==0){
                    return false;
                }
                b++;
            }
        }
        return true;
    }
}