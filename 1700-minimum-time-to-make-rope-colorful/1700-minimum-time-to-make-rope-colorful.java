class Solution {
      public int minCost(String colors, int[] neededTime) {
        boolean[] flags=new boolean[neededTime.length];
int cost=0;

int min=0;
       int i=0;
       int j=1;
       while(j< neededTime.length){
           if(colors.charAt(i)==colors.charAt(j)){
               if(neededTime[i]>neededTime[j]){
                  
                   min=neededTime[j];
               }
               else{
                   min=neededTime[i]; 
                   i=j;
               }
               j++;
               cost+=min;
           }
           else{
            i=j;
            j=j+1;
           }
       }

    return cost;
    }
}