class Solution {
     public String interpret(String command) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        int j=0;
        while (j<command.length()){
            if(command.charAt(j)=='G')builder.append('G');
            if(command.charAt(j)=='('){
                i=j;
            }
            if(command.charAt(j)==')' && j-1==i)builder.append('o');;
            if(command.charAt(j)==')' && j-1!=i)builder.append("al");;
            j++;
        }
        return builder.toString();
    }
}