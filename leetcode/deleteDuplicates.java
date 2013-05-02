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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return head;

        ListNode pre = head;
        ListNode curr = head.next;
        while (curr != null) {
            while (curr != null && curr.val == pre.val) {
                curr = curr.next;
            }
            pre.next = curr;
            if (curr == null)
                break;
            else {
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
