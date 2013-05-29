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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(0);
        ListNode p1 = h1;
        ListNode p2 = h2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            }
            else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p1.next = h2.next;
        p2.next = null;
        return h1.next;
    }
}
