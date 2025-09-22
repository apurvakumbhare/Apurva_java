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
       public ListNode insertGreatestCommonDivisors(ListNode head) {
    if(head==null || head.next==null)return head;
        ListNode temp= head;
        ListNode Next= head.next;
        int mid;
        while(Next!=null){
         mid=gcd(temp.val,Next.val);
            ListNode midnode=new ListNode(mid,Next);
         temp.next=midnode;
        temp = Next;
            Next = Next.next;
        }
        return head;
    }

    int gcd(int a, int b){
        int min=(a>b)?b:a;
        int max=(a<b)?b:a;
        
        for (int i = min; i >0; i--) {
            if(min%i==0 && max% i==0)return i;
        }
        return 0;
    }
    }
