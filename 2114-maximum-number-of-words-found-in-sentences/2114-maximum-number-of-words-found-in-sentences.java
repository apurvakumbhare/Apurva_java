class Solution {
    public int mostWordsFound(String[] sentences) {
    int max=0;
        for (int i = 0; i < sentences.length; i++) {
            String[] subarray=sentences[i].split(" ");
            max=(subarray.length>max)?subarray.length:max;
        }
        return max;
    }
}