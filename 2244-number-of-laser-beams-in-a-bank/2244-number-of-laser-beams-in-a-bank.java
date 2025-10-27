class Solution {
 public int numberOfBeams(String[] bank) {
        int ans=0;
        int current;
        int past=0;
    for (int i = 0; i < bank.length; i++) {
        current=set(bank[i]);
      if (current == 0) continue;
        ans+=past*current;
        past=current;
    }
    return ans;
}

    private int set(String s) {
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='1')count++;
        }
        return count;
    }
}