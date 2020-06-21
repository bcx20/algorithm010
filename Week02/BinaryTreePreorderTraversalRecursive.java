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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        this.traverse(res, root);
        return res;
    }

    public void traverse(List<Integer> res, TreeNode root) {
        if(root == null) return;
        res.add(root.val);
        this.traverse(res, root.left);
        this.traverse(res, root.right);
    }
}