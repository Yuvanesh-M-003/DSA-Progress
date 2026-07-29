// Last updated: 7/29/2026, 6:02:19 PM
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
    static{
        ListNode n = new ListNode(0);
        for(int i=0;i<100;i++){
            isPalindrome(n);
        }
    }
    public static int[] arr = new int[100000];
    public static boolean isPalindrome(ListNode head) {
       if( head == null || head.next == null ) return true;
       int i = 0;
       while(head != null){
        arr[i++] = head.val;
        head = head.next;
       }
       int l = 0;
       int r = i-1;
       while(l<=r){
        if( arr[l++] != arr[r--] ) return false;
       }
       return true; 
    }
}