class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
    PriorityQueue<Integer> forSeats=new PriorityQueue<>();
        PriorityQueue<Integer> forstudents=new PriorityQueue<>();
        for (int i = 0; i < seats.length; i++) {
            forSeats.add(seats[i]);
            forstudents.add(students[i]);
        }
        int minMoves=0; 
        for (int i = 0; i <seats.length ; i++) {
          minMoves+=Math.abs(forSeats.poll()-forstudents.poll());  
        }
        return minMoves;
    }
}