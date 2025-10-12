class Solution {
     public int countBeautifulPairs(int[] nums) {
int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int first = firstDigit(nums[i]);
                int last = nums[j] % 10; 
                if(coPrime(first,last))count++;
            }
        }
        return count;
    }

    private boolean coPrime(int num, int num1) {
        if(num==1 || num1==1)return true;
        int min=Math.min(num,num1);
        for (int i =min ; i >1 ; i--) {
             
            if(num% i==0 && num1 % i==0)return false;
        }
        return true;
    }
      private int firstDigit(int num) {
        while (num >= 10) num /= 10;
        return num;
    }
}