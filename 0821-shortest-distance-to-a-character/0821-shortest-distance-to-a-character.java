class Solution {
public int[] shortestToChar(String s, char c) {
        int i=0;
        int[] ans=new int[s.length()];
        ArrayList<Integer> index=new ArrayList<>();
        for (int k = 0; k < s.length(); k++) {
            if(s.charAt(k)==c){
                index.add(k);
            }
        }
       for (int j = 0; j < s.length(); j++) {

   
    if (i < index.size() - 1 &&
        Math.abs(j - index.get(i)) > Math.abs(j - index.get(i + 1))) {

        ans[j] = Math.abs(j - index.get(i + 1));
        i++;  
    } 
    else {
        ans[j] = Math.abs(j - index.get(i));
    }
}
        return ans;
    }
}