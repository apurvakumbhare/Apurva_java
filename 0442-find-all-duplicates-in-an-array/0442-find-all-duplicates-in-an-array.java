class Solution {
    public List<Integer> findDuplicates(int[] a) {
         ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        while(i<a.length){
            int cur=a[i]-1;
            if(a[i]!=a[cur]){
                    int temp=a[cur];
                    a[cur]=a[i];
                    a[i]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j]!=j+1){
                l.add(a[j]);
            }
        }
        return l;
    }
    }
