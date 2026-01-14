class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
       
        for (int i = 0; i < score.length-1; i++) {
          int maxIdx = i;

            for (int j = i + 1; j < score.length; j++) {
                if (score[j][k] > score[maxIdx][k]) {
                    maxIdx = j;
                }
            }

            if (maxIdx != i) {
                int[] temp = score[i];
                score[i] = score[maxIdx];
                score[maxIdx] = temp;
            }
        }
        return score;}
}