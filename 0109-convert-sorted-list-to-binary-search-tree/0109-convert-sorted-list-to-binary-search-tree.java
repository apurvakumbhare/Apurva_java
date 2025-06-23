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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       
    if(head==null){
        return null;
    }
        if (head.next == null) return new TreeNode(head.val);
        ListNode prev=null;
        ListNode start=head;
        ListNode end=head;
        while (end != null && end.next != null) {
            prev=start;
            start=start.next;
            end=end.next.next;
        }
        if(prev.next!=null){
            prev.next=null;
        }
        TreeNode node=new TreeNode(start.val);
    node.left=(start != head) ? sortedListToBST(head) : null;
        node.right=sortedListToBST(start.next);
        return node;
    
    }
}