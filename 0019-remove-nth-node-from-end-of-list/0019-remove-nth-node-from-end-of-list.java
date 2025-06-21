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
  public ListNode removeNthFromEnd(ListNode head, int n) {
         int len = size(head);
        int target = len - n;

        if (target == 0) return head.next; // remove head

        ListNode temp = head;
        for (int i = 0; i < target - 1; i++) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
   
       public int size(ListNode head) {
        int siz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            siz++;
        }
        return siz;
    
    }
}