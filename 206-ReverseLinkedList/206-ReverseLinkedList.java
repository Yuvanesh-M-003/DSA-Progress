// Last updated: 7/29/2026, 6:02:38 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
}