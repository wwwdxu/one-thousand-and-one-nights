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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
            return true;
        TreeNode leftchild = root.left;
        TreeNode rightchild = root.right;
        if (leftchild == null && rightchild == null)
            return true;
        if (leftchild == null || rightchild == null)
            return false;
        if (leftchild.val != rightchild.val)
            return false;
        return isSymmetric(leftchild.left, rightchild.right) && isSymmetric(leftchild.right, rightchild.left);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
