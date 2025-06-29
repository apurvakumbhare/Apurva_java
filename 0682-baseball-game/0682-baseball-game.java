class Solution {
     public int calPoints(String[] operations) {
Stack<Integer> ans=new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")){
                ans.push(ans.peek()+ans.get(ans.size()-2));
            }else if(operations[i].equals("D")){
                ans.push(ans.peek()*2);
            } else if (operations[i].equals("C")) {
              ans.pop();
            }
            else{
                ans.push(Integer.valueOf(operations[i]) );
            }
        }
        int sum=0;
        while (!ans.isEmpty()) {
            sum+=ans.pop();
        }
        return sum;
    }
}