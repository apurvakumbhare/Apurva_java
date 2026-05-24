/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class Solution {
    public Node reverseKGroup(Node head, int k) {
        if(head==null || head.next==null)return head;
        int n =k;
        Node prev=null;
        Node curr=head;
        while(curr!=null && n!=0 ){
          Node next=curr.next;
          curr.next=prev;
          prev=curr;
       
          curr=next;
          n--;
        }
        if(curr!=null)
        head.next=reverseKGroup(curr,k) ;
        return prev;
    }
}