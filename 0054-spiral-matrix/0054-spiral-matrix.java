class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(startrow<=endrow && startcol<=endcol){
            
            for(int i=startcol;i<=endcol;i++){
                list.add(arr[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                list.add(arr[i][endcol]);
            }
            if (startrow < endrow) {
            for(int i=endcol-1;i>=startcol;i--){
                list.add(arr[endrow][i]);
            }
            }
            if (startcol <endcol) {
            for(int i=endrow-1;i>startrow;i--){
                list.add(arr[i][startcol]);
            }
            }
           startrow++;
           endrow--;
           startcol++;
           endcol--;
        }
        return list;
    
    }
}