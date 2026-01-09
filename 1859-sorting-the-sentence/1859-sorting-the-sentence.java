class Solution {
   public String sortSentence(String s) {
        String[] word=s.split("\\s+");
        String[] order=new String[word.length];
        for (int i = 0; i < word.length; i++) {
              int index = word[i].charAt(word[i].length() - 1) - '0' - 1;
            order[index] = word[i].substring(0, word[i].length() - 1);
        }
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < order.length; i++) {
            builder.append(order[i]);
             if (i < order.length - 1) builder.append(" ");
        }
        return builder.toString();

    }
}