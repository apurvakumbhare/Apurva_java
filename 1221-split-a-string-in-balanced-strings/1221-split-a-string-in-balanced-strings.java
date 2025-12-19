class Solution {
      public int balancedStringSplit(String s) {
int count=0;
int i=0,j=0;
int rcount=0,lcount=0;

while (j<s.length()){
    if(s.charAt(j)=='R')rcount++;
    if(s.charAt(j)=='L')lcount++;
    if(rcount==lcount){
        count++;
        i=j+1;
    }
    j++;
}
return count;
    }

}