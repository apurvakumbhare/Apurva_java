class Solution {
   public String convertDateToBinary(String date) {
        StringBuilder builder=new StringBuilder();
 int Year=Integer.parseInt(date.substring(0,4));
builder.append(Integer.toBinaryString(Year)+"-");

        int month=Integer.parseInt(date.substring(5,7));
        builder.append(Integer.toBinaryString(month)+"-");
        int Date=Integer.parseInt(date.substring(8,date.length()));
        builder.append(Integer.toBinaryString(Date));
        return builder.toString();
    }
}