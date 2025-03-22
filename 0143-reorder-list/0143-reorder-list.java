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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return ;
        }
        ListNode mid=middleNode(head);
        ListNode e=reverseList(mid);
        ListNode s=head;
           
            while(s!=null && e!=null){
                ListNode temp=s.next;
                s.next=e;
                s=temp;
                temp=e.next;
                e.next=s;
                e=temp;

            }
            if(s != null){
                s.next=null;
            }
            
    }
    public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pres=head;
     
        ListNode prev=null;
        while(pres!=null){
             ListNode temp = pres.next;
              pres.next=prev;
              prev=pres;
              pres=temp;
        }
        return prev;
      }
    
}