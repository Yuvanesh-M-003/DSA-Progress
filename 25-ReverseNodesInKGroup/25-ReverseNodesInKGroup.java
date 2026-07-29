// Last updated: 7/29/2026, 6:05:23 PM
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
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (true) {
            ListNode end = prev;
            for (int i = 0; i < k; i++) {
                end = end.next;
                if (end == null) return dummy.next;
            }
            ListNode start = prev.next;
            ListNode nextGroup = end.next;
            ListNode a = nextGroup;
            ListNode b = start;
            while (b != nextGroup) {
                ListNode temp = b.next;
                b.next = a;
                a = b;
                b = temp;
            }
            prev.next = end;
            prev = start;
        }
    }
}
