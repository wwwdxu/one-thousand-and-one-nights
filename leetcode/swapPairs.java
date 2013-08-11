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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode tmp = null;
        ListNode newhead = null;
        ListNode pre = null;
        while (head != null) {
            if (tmp == null) {
                tmp = head;
                head = head.next;
            }
            else {
                if (pre == null) {
                    pre = head;
                }
                else {
                    pre.next = head;
                    pre = pre.next;
                }
                tmp.next = pre.next;
                pre.next = tmp;
                if (newhead == null)
                    newhead = pre;
                pre = pre.next;
                tmp = null;
                head = pre.next;
            }
        }
        if (tmp != null)
            pre.next = tmp;
        else {
            pre.next = null;
        }
        return newhead;
    }
}
