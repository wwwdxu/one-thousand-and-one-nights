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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return ret;
        LinkedList<TreeNode> l1 = new LinkedList<TreeNode>();
        l1.add(root);
        while (l1.size() != 0) {
            LinkedList<TreeNode> l2 = new LinkedList<TreeNode>();
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            while (l1.size() != 0) {
                TreeNode tmpNode = l1.removeFirst();
                tmpList.add(tmpNode.val);
                if (tmpNode.left != null)
                    l2.add(tmpNode.left);
                if (tmpNode.right != null)
                    l2.add(tmpNode.right);
            }
            ret.add(tmpList);
            l1 = l2;
        }
        return ret;
    }
}
