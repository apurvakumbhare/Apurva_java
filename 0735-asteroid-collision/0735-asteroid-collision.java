class Solution {
     public int[] asteroidCollision(int[] asteroids) {
    int i=0;
        Stack<Integer> s=new Stack<>();
    while(i<asteroids.length){
        if(asteroids[i]>=0){
            s.push(asteroids[i]);
            i++;
        }
        else{
            if(s.isEmpty() || s.peek()<0){
                s.push(asteroids[i]);
                i++;
            }else if(!s.isEmpty() && s.peek()<Math.abs(asteroids[i])){
                s.pop();
            }
            else if(!s.isEmpty() && s.peek()==Math.abs(asteroids[i])){
                s.pop();
                i++;
            }
            else if(!s.isEmpty() && s.peek()>Math.abs(asteroids[i])){
                i++;
            }
        }
    }
    return s.stream().mapToInt(Integer::intValue).toArray();
     }
}