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
     public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null||head.next.next==null)return head;
        
        ListNode oddl=head;
        ListNode sec=head.next;
        ListNode even=sec;
        ListNode temp = head.next.next;
        boolean odd=true;
        while(temp!=null){
           if(odd){
               oddl.next=temp;
               oddl = oddl.next;
               temp=temp.next;
               odd=false;
           }
else{even.next=temp;
               even = even.next;
               temp=temp.next;
    odd=true;
           }

        }
        oddl.next=sec;
          even.next = null;
        return head;
    }

}