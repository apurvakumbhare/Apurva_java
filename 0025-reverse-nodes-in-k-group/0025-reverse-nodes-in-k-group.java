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
    public ListNode reverseKGroup(ListNode head, int k) {
       
        if(k<=1 || head==null){
            return head;
        }

        ListNode curr=head;
        ListNode prev=null;
       while(curr!=null){
        ListNode temp = curr;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            if (count < k) {
                break; // Less than k nodes left, don't reverse
            }
        ListNode last=prev;
           ListNode newlast=curr;
           for(int i=0;curr!=null && i<k;i++){
             ListNode t=curr.next;
             curr.next=prev;
              prev=curr;
              curr=t;
           }
           if(last==null){
            head=prev;
           }else{
            last.next=prev;
           }
           
           newlast.next=curr;
           prev=newlast;
       }
           
           return head;
    
}
    
}