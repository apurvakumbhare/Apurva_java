class Solution {
   public int longestPalindrome(String s) {
int[] sum = new int[128]; 
        for (int i = 0; i < s.length(); i++) {
            sum[s.charAt(i)]++;
        }
        int total=0;
        boolean flag=false;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]%2==0)total+=sum[i];
            else {
                total += sum[i] - 1; 
                flag = true;    
            }
        }
        if(flag==true)total+=1;
        return total;
    }
}