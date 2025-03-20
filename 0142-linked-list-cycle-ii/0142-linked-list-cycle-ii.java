/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
       int len=leng(head);
       if(len==0){
        return null;
       }
       for(int i=0;i<len;i++){
        s=s.next;
       }
       while(f!=s){
        f=f.next;
        s=s.next;
       }
       return s;
        }
         public int leng(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while( f!=null &&f.next!=null ){
            f=f.next.next;
            s=s.next;
            if(f==s){
                int length=0;
               ListNode temp=s;
               do{
                 length++;
                temp=temp.next;
               }while(temp!=s);
               return length;
            }
            
             }
             return 0;
        }
}