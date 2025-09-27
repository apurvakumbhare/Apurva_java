class BrowserHistory {
        ListNode head;
        public BrowserHistory(String homepage) {
          head=new ListNode(homepage);
        }

        public void visit(String url) {
            ListNode node=new ListNode(url);
            node.prev=head;
            head.next=node;
            head= head.next;
        }
        ListNode temp=head;
        public String back(int steps) {
        while(steps>0 && head.prev!=null){
            head=head.prev;
            steps--;
        }
        return head.val;
        }

        public String forward(int steps) {
            while(steps>0 && head.next!=null){
                head=head.next;
                steps--;
            }
            return head.val;
        }
    }
 class ListNode{
    String val;
    ListNode next=null;
    ListNode prev=null;

    public ListNode(String val) {
        this.val = val;
    }

    public ListNode(String val, ListNode prev) {
        this.val = val;
        this.prev = prev;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */