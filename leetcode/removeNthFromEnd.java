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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return head;
        ListNode p = head;
        int i;
        for (i=0; i<n; i++) {
            p = p.next;
            if (p == null)
                break;
        }
        if (i == n-1 && p == null)
            return head.next;
        else if (i < n-1 && p == null)
            return head;
        ListNode q = head;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}
