class Solution {
    public boolean judgeCircle(String moves) {
        int L=0,R=0,U=0,D=0;
       for (int i = 0; i < moves.length(); i++) {
           if(moves.charAt(i)=='L'){
               if(R>0)R-- ;else L++;
           }
           if(moves.charAt(i)=='R'){
               if(L>0)L-- ;else R++;
           } if(moves.charAt(i)=='U'){
               if(D>0)D-- ;else U++;
           }
           if(moves.charAt(i)=='D'){
               if(U>0)U-- ;else D++;
           }
       }
       if(L==0 && R==0 && U==0 && D==0)return true;
       else return false;
    }
}