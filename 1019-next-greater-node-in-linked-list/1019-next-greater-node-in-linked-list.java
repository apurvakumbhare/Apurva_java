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
    public int[] nextLargerNodes(ListNode head) {
    if(head==null){
        return null;
    }
    ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
    while (temp!=null){
        ListNode nexted=(temp.next!=null)?temp.next:null;
        int nextgreater=0;
        while (nexted!=null){
            if(nexted.val>temp.val) {
                nextgreater=nexted.val;
              
                break;
            }
            
            nexted=nexted.next;
        }
          list.add(nextgreater);
        temp=temp.next;
    }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
    return result;
    }
}