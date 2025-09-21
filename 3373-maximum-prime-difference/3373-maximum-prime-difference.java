class Solution {
     public int maximumPrimeDifference(int[] nums) {
      int i=0 , j=nums.length-1;
      while(i<j){
          while(i<j && !isPrime(nums[i]))i++;
          while(j>i && !isPrime(nums[j]))j--;
          return j-i;
      }
      return 0;
    }
    boolean isPrime(int n){
       if(n < 2) return false;      
       if(n == 2) return true;     
       if(n % 2 == 0) return false; 
       for (int i = 3; i * i <= n; i += 2) {
    if(n % i == 0) return false;
}
        return  true;
    }
}