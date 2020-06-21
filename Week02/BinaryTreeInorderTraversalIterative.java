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
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while(currentNode != null || !stk.empty()) {
            while(currentNode != null) {
                stk.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stk.pop();
            res.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return res;
    }
}