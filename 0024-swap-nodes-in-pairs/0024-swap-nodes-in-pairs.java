/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode swapPairs(ListNode head) {
        Optional<ListNode> prev =Optional.ofNullable(head);
        if(!prev.isPresent()){
            return head;
        }

        Optional<ListNode> temp =Optional.ofNullable(head.next);
        if(!temp.isPresent()){
            return head;
        }
        while(prev.isPresent() && temp.isPresent()){
            ListNode p=prev.get();
            ListNode t=temp.get();
           int value=p.val;
            p.val=t.val;
            t.val=value;
            prev=Optional.ofNullable(t.next);;
            temp=prev.flatMap(n -> Optional.ofNullable(n.next));
        }
        return head;
    }
}