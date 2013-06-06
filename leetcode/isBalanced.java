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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
            return true;
        int d1 = getDepth(root.left);
        int d2 = getDepth(root.right);
        if (Math.abs(d1-d2)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(getDepth(root.left), getDepth(root.right))+1;
    }
}
