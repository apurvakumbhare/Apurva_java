class Solution {
    public int addDigits(int num) {
    if(num<10){
        return num;
    }
    
    while(num>=10){
        int temp=0;
        while(num>0){
            int a=num%10;
           num=num/10;
            temp+=a;
        }
        num=temp;
    }
        return num;
    }
}