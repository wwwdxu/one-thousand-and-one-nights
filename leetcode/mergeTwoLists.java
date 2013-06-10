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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ret.next = l1;
                l1 = l1.next;
            }
            else {
                ret.next = l2;
                l2 = l2.next;
            }
            ret = ret.next;
        }
        while (l1 != null) {
            ret.next = l1;
            l1 = l1.next;
            ret = ret.next;
        }
        while (l2 != null) {
            ret.next = l2;
            l2 = l2.next;
            ret = ret.next;
        }
        return head.next;
    }
}
