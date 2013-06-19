/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (num == null || num.length == 0)
            return null;
        return convert(num, 0, num.length-1);
    }

    public TreeNode convert(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode tnode = new TreeNode(num[mid]);
        tnode.left = convert(num, start, mid-1);
        tnode.right = convert(num, mid+1, end);
        return tnode;
    }
}
