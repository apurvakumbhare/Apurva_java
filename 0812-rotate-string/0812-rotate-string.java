class Solution {
    public boolean rotateString(String si, String goal) {
        if(si.length()!=goal.length()){
            return false;
        }
        String s=si+si;
        return s.contains(goal);
    }
}