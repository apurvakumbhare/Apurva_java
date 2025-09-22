class Solution {
      public boolean checkPrimeFrequency(int[] nums) {
        if(nums.length<=1)return false;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]> max)max=nums[i];
        }
        int[] freq=new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i <freq.length; i++) {
            if(isPrime(freq[i]))return true;
        }
        return false;
    }
    boolean isPrime(int n){
        if(n<=1)return false;
        if( n==2)return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i*i<=n; i+=2) {
            if(n%i==0)return false;
        }
        return  true;
    }
}