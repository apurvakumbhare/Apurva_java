class Solution {
    public boolean isPalindrome(String s) {
          String z=s.toLowerCase();
        String a=z.replace(" ","");
   
        StringBuilder que=new StringBuilder();
        for (int j = 0; j < a.length(); j++) {
            if(a.charAt(j) >= 'a' && a.charAt(j) <= 'z' ||a.charAt(j) >= '0' && a.charAt(j) <= '9' ){
                que.append(a.charAt(j));
            }
            
        }
        String question=que.toString();
    
        StringBuilder result=new StringBuilder(question).reverse();
        String result1=result.toString();
        return result1.toString().equals(question);   
    }
}