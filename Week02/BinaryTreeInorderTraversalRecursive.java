/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        this.traverse(res, root);
        return res;
    }

    public void traverse(List<Integer> res, TreeNode root) {
        if (root == null) return;
        this.traverse(res, root.left);
        res.add(root.val);
        traverse(res, root.right);
    }
}