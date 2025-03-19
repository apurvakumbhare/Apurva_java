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
        public ListNode mergeTwoLists(ListNode f, ListNode s) {
        ListNode ans=new ListNode();
        ListNode tail=ans;
        while(f!=null && s!=null) {
            if (f.val < s.val) {
                tail.next=f;
                f = f.next;
                tail=tail.next;
            } else {
                tail.next=s;
                s = s.next;
                tail=tail.next;
            }
        }
         tail.next=(f!=null)?f:s;
            return ans.next;
        }
}