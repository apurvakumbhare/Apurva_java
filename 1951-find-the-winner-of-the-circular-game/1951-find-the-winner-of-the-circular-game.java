class Solution {
public static int findTheWinner(int n, int k) {
        ArrayList<Integer> que=new ArrayList<>(n);
        for (int i = 0; i <n ; i++) {
            que.add(i+1);
        }
       return startGame(que,0,k);
    }

    private static int startGame(ArrayList<Integer> que,int gameIndex, int k) {
        if(que.size()==1)return que.get(0);
        int index=(gameIndex+k-1)%que.size();
         que.remove(index);
        System.out.println(que);
        return startGame(que,index,k);
    }
}