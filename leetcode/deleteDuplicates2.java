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
        ListNode phead = head;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (phead != null) {
            if (map.containsKey(phead.val)) {
                int freq = map.get(phead.val);
                map.put(phead.val, freq+1);
            }
            else {
                map.put(phead.val, 1);
            }
            phead = phead.next;
        }
        ListNode ret = new ListNode(0);
        ListNode p = ret;
        while (head != null) {
            if (map.get(head.val) > 1) {
                head = head.next;
            }
            else {
                ret.next = head;
                ret = ret.next;
                head = head.next;
            }
        }
        ret.next = null;
        return p.next;
    }
}
