class Solution {
      public static int countDigits(int num) {
if(num<10)return 1;
int n=num,count=0;
while (n>0){
    if(num%(n%10)==0)count++;
    n/=10;
}
return count;
    }
}