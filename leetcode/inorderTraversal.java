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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root == null)
            return ret;
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode tnode = root;

        while (!st.empty() || tnode != null) {
            if (tnode != null) {
                st.push(tnode);
                tnode = tnode.left;
            }
            else {
                tnode = st.pop();
                ret.add(tnode.val);
                tnode = tnode.right;
            }
        }
        return ret;
    }
}  
