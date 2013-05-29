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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return head;
        ListNode p = head;
        int len = 1;
        while (p.next != null) {
            len++;
            p = p.next;
        }
        n = n%len;
        p = head;
        if (n == 0)
            return head;
        for (int i=1; i<n; i++) {
            if (p.next == null)
                return head;
            p = p.next;

        }
        ListNode q = head;
        while (p.next != null) {
            q = q.next;
            p = p.next;
        }
        if (q == head)
            return head;
        else {
            p.next = head;
            while (head.next != q)
                head = head.next;
            head.next = null;
            return q;
        }
    }
}
