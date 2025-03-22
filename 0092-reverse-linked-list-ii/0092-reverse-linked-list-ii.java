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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;curr!=null && i<left-1;i++){
             prev=curr;
            curr=curr.next;
           }
           ListNode last=prev;
           ListNode newlast=curr;
           for(int i=0;curr!=null && i<right-left+1;i++){
             ListNode temp=curr.next;
             curr.next=prev;
              prev=curr;
              curr=temp;
           }
           if(last==null){
            head=prev;
           }else{
            last.next=prev;
           }
           
           newlast.next=curr;
           return head;
    }
}