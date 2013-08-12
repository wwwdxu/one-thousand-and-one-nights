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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
            return null;
        if (k == 1)
            return head;
        int len = 0;
        ListNode p = head;
        ListNode q = head;
        ListNode ret = null;
        ListNode afore = null;
        while (p != null) {
            len++;
            p = p.next;
        }
        if (len < k) return head;
        for (int i=0; i<len/k; i++) {
            ListNode tail = q;
            ListNode pre = tail;
            q = q.next;
            for (int j=1; j<k; j++) {
                ListNode tmp = q.next;
                q.next = pre;
                pre = q;
                q = tmp;
                if (j == k-1 && ret == null)
                    ret = pre;
                else if (j == k-1 && afore != null)
                    afore.next = pre;
            }
            afore = tail;
        }
        afore.next = q;
        return ret;
    }
}
