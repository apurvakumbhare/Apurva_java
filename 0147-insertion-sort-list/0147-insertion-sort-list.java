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
    public ListNode insertionSortList(ListNode head) {
         if(head==null|| head.next==null)return head;
       ListNode next=insertionSortList(head.next);
       ListNode temp=next;
       if(temp.val>=head.val)head.next=temp;
       else {
            ListNode prev=new ListNode(0);
        while(temp !=null && temp.val<head.val){
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
        head.next=temp;
        head=next;
        
       }
        
        return head; 
    }
}