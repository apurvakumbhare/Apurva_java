class Solution {
    public String countAndSay(int n) {
    
       return countAndSay(n-1,"1");
    }

    private  String countAndSay(int n, String number) {
        if(n==0)return number;
        StringBuilder builder=new StringBuilder();
        int count=1;
        for (int i = 1; i < number.length(); i++) {
            if(number.charAt(i)==number.charAt(i-1)){
                count++;
            }else{
                builder.append(count);
                builder.append(number.charAt(i-1));
                count=1;
            }
        }
        builder.append(count);
        builder.append(number.charAt(number.length()-1));
        return countAndSay(n-1, builder.toString());
    }

}