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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int r = 0;
        ListNode ret = new ListNode(0);
        ListNode p = ret;
        while (l1 != null && l2 != null) {
            ListNode node = new ListNode((l1.val+l2.val+r)%10);
            p.next = node;
            p = p.next;
            r = (l1.val+l2.val+r)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            ListNode node = new ListNode((l1.val+r)%10);
            p.next = node;
            p = p.next;
            r = (l1.val+r)/10;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode node = new ListNode((l2.val+r)%10);
            p.next = node;
            p = p.next;
            r = (l2.val+r)/10;
            l2 = l2.next;
        }
        if (r>0) {
            ListNode node = new ListNode(r);
            p.next = node;
        }
        return ret.next;
    }
}
