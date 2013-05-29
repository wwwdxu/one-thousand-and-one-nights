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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode curr = head;
        int i = 1;
        for (; i<m; i++) {
            pre = curr;
            curr = curr.next;
        }
        ListNode beforeNode = pre;
        ListNode endNode = curr;
        ListNode tmp = curr.next;
        for (; i<n; i++) {
            pre = curr;
            curr = tmp;
            tmp = curr.next;
            curr.next = pre;
        }
        if (beforeNode == null) {
            head = curr;
            endNode.next = tmp;
        }
        else {
            beforeNode.next = curr;
            endNode.next = tmp;
        }
        return head;
    }
}
