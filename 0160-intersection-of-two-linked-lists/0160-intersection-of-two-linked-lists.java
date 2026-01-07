/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null ||headB==null)return null;
//        ArrayList<ListNode> listA=new ArrayList<>();
//         ArrayList<ListNode> listB=new ArrayList<>();
//         while(headA!=null){
//             listA.add(headA);
//             headA=headA.next;
//         }
//         while(headB!=null){
//             listB.add(headB);
//             headB=headB.next;
//         }
//         for (int i = 0; i < listA.size(); i++) {
//             for (int j = 0; j < listB.size(); j++) {
//                 if(listA.get(i)==listB.get(j)){
//                     return listA.get(i);
                    
//                 }
//             }
//         }
       
//         return null;
        
//     }
    //optimal
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; 
    }
}