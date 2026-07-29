// Last updated: 7/29/2026, 6:04:21 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode a = head;

        while(a != null && a.next != null)
        {
           if(a.val == a.next.val)
           {
            a.next = a.next.next;
           }
           else
           {
            a = a.next;
           }
        }
        return head;
    }
}
// ublic ListNode deleteDuplicates(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode current = head;
//         while (current != null && current.next != null) {
//             if (current.val == current.next.val) {
//                 current.next = current.next.next;
//             } else {
//                 current = current.next;
//             }
//         }

//         return head;