class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> ans=new ArrayList<>();
    int max=max(candies);
    for (int i = 0; i < candies.length; i++) {
        if(candies[i]+extraCandies >=max)ans.add(true);
        else ans.add(false);
    }
    return ans;
}
public int max(int[] num){
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
        max=Math.max(max,num[i]);
    }
    return max;
}
}