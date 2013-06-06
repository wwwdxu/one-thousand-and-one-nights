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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
            return true;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode previous = null;
        while (!st.empty() || current != null) {
            if (current != null) {
                st.push(current);
                current = current.left;
            }
            else {
                current = st.pop();
                if (previous == null) {
                    previous = current;
                }
                else {
                    if (current.val <= previous.val)
                        return false;
                    previous = current;
                }
                current = current.right;
            }
        }
        return true;
    }
}
