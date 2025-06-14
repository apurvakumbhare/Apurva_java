class Solution {
      public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
    char[] c=s.toCharArray();
        for (char d:c) {
            if (sb.length()>0 && sb.charAt(sb.length()-1)==d){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(d);
            }
        }
        return sb.toString();
    }
}