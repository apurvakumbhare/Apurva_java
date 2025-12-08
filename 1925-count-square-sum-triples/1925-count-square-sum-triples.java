class Solution {
public static int countTriples(int n) {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = i+1; j <=n; j++) {
                if(Math.sqrt((i*i) + (j*j)) %1==0 &&Math.sqrt((i*i) + (j*j))<=n){
                    
                count+=2;
            }

            }
        }
        return count;
    }
}