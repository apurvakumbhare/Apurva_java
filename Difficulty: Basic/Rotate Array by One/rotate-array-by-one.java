// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int temp=arr[arr.length-1];
        int i =arr.length-1;
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=temp;
        
    }
}