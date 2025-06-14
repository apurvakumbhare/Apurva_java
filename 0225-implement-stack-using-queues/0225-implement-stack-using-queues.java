class MyStack {
 Queue<Integer> q;
    Queue<Integer> h;
    public MyStack() {
        q=new ArrayDeque<>();
        h=new ArrayDeque<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        while (q.size()>1) {
            h.add(q.remove());
        }
        int removed=q.remove();
        while (!h.isEmpty()) {
            q.add(h.remove());
        }
        return removed;
    }

    public int top() {
        while (q.size()>1) {
            h.add(q.remove());
        }
        int top=q.remove();
        h.add(top);
        while (!h.isEmpty()) {
            q.add(h.remove());
        }
        return top;
    }

    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.top());

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */