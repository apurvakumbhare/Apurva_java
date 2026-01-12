class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,b=0;
        int i=0,j=s.length()-1;
        while(i<j){
            if("aeiouAEIOU".indexOf(s.charAt(i++))!=-1)a++;
            if("aeiouAEIOU".indexOf(s.charAt(j--))!=-1)b++;
        }
        return a==b;
    }
}