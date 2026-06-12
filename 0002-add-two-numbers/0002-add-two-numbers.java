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
        int r = 0;
        while(l1.next != null && l2.next != null)
        {
            int add = l1.val +l2.val + r;
            if(add >= 10) {
                r = 1;
                add -= 10;
            }
            l1.val = add;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}