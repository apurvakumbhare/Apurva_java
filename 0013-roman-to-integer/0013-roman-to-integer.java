class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int num = answer(s.charAt(i));

            if (prev <= num) {
                ans += num;
            } else {
                ans -= num;
            }
           prev=num;
        }
        return ans;
    }
        public static int answer(char a){

            switch (a){
                case 'I': return 1;
                case 'V':return 5;
                case 'C':return 100;
                case 'L':return 50;
                case 'M':return 1000;
                case 'X':return 10;
                case 'D':return 500;
                default:return 0;
            }

        }



}