class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stack = new Stack<>();
    HashSet<Integer> visited = new HashSet<>();

    stack.add(0);        
    visited.add(0);

    while (!stack.isEmpty()) {
        int current = stack.pop();
        List<Integer> keys = rooms.get(current);

        for (int i = 0; i < keys.size(); i++) {
            int next = keys.get(i);
            if (!visited.contains(next)) {
                visited.add(next);
                stack.add(next);
            }
        }
    }
    return visited.size() == rooms.size();
    }
}