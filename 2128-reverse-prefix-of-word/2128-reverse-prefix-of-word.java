class Solution {
       public String reversePrefix(String word, char ch) {
int i=0 , j=0;
while(j<word.length() && word.charAt(j)!=ch){
    j++;
}
if(j>word.length()-1)return word;
StringBuilder builder=new StringBuilder(word);
char temp;
while(i<j){
    temp=builder.charAt(j);
    builder.setCharAt(j,builder.charAt(i));
    builder.setCharAt(i,temp);
   i++;
   j--;
}
    return builder.toString();}
}
