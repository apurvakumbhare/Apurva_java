class Solution {
    public boolean squareIsWhite(String coordinates) {
       if(((coordinates.charAt(0)-'a')%2==0 && coordinates.charAt(1)%2==1)||((coordinates.charAt(0)-'a')%2==1 && coordinates.charAt(1)%2==0)) return false;
       else return true;
    }
}