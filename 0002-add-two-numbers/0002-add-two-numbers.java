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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify list operations
        ListNode current = dummyHead; // Pointer for result list
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val; // Add value from l1
                l1 = l1.next; // Move to next node
            }

            if (l2 != null) {
                sum += l2.val; // Add value from l2
                l2 = l2.next; // Move to next node
            }

            carry = sum / 10; // Compute carry for next iteration
            current.next = new ListNode(sum % 10); // Create a new node with the sum modulo 10
            current = current.next; // Move current pointer forward
        }

        return dummyHead.next; // Return the result list (skip dummy head)
    }
}
