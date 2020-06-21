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
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode currentNode = root;
        while(currentNode != null || !stk.empty()) {
            while(currentNode != null) {
                res.add(currentNode.val);
                stk.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stk.pop();
            currentNode = currentNode.right;
        }
        return res;
    }
}