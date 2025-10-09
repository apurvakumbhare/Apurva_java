class Solution {
  public int gcdOfOddEvenSums(int n) {
    int evencount=0,evensum=0;
        int oddcount=0,oddsum=0;
        int i=1;
        while(true){
            if(i%2==0 && evencount<n){
                evencount++;
                evensum+=i; 
            }
            if(i%2==1 && oddcount<n){
                oddcount++;
                oddsum+=i;
            }
                if(evencount==n && oddcount==n)break;
            i++;
        }
        return gcd(evensum,oddsum);
        
    }

    private int gcd(int evensum, int oddsum) {
        for (int i = Math.min(evensum,oddsum); i >1 ; i--) {
           if(evensum%i==0 && oddsum%i==0)return i; 
        }
        return 1;
    }
}