// Last updated: 7/29/2026, 5:59:29 PM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head,temp = null;
        while(head == null || head.next  == null)
        {
            return null;
        }
        while(fast !=  null && fast.next != null)
        {
            temp = slow ;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}