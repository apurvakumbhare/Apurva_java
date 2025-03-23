class Solution {
    public int findDuplicate(int[] a) {
        
        int i=0;
        while(i<a.length ) {
            if(a[i]!=i+1){
                 int c=a[i]-1;
            if( a[i]!=a[c] ){
                    int temp=a[i];
                    a[i]=a[c];
                    a[c]=temp;
                }
                else{
                   return a[i];
                }
            }
          else{
            i++;
          }
        }
        return -1;
    }
}
