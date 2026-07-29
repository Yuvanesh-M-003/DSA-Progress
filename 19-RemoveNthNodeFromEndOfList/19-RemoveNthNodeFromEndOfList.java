// Last updated: 7/29/2026, 6:05:29 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        if(head.next == null)
        {
            if(n == 1) return null;
            return head;
        }
        ListNode temp = head;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        if (n == count) {
            return head.next;
        }
        int val = count - n,i=0;
        temp = head;
        while(temp!=null )
        {
            if(i == val-1)
            {
                temp.next = temp.next.next;
            }
            temp =temp.next;
            i++;
        }
        return head;
    }
}