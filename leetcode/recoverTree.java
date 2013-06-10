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

    TreeNode pre;
    TreeNode first;
    TreeNode second;

    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        pre = null;
        first = null;
        second = null;
        traverse(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
        return;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;
        traverse(root.left);
        if (pre == null)
            pre = root;
        else {
            if (pre.val >= root.val) {
                if (first == null)
                    first = pre;
                second = root;
            }
            pre = root;
        }
        traverse(root.right);
    }
}
