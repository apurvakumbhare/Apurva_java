import java.util.Arrays; 
class Solution {
    public void reverseString(char[] arr) {
        // int s=0;
        // int e=arr.length-1;
        // while(s<e){
        //     char temp= arr[s];
        // arr[s]=arr[e];
        // arr[e]=temp;
        //     s++;
        //     e--;
        // }
        for(int i=0;i<arr.length/2;i++){
            char temp =arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
       
    }
}