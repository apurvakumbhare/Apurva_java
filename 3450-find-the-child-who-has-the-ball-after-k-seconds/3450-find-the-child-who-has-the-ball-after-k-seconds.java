class Solution {
    public int numberOfChild(int n, int k) {
     boolean zigzag=false;
     while(k>=n-1){
        k=k-(n-1);
        zigzag=!zigzag;
     }   

    return (zigzag)?(n-k-1):k;
    }
}