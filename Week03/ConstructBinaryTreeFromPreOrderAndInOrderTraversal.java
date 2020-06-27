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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return this.recursive(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode recursive(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if(pStart == pEnd) return null;
        TreeNode root = new TreeNode(preorder[pStart]);
        int rootIndexInInorder = findIndex(root.val, inorder);
        int leftNodeCount = rootIndexInInorder - iStart;
        root.left = recursive(preorder, pStart + 1, pStart + leftNodeCount + 1, inorder, iStart, rootIndexInInorder);
        root.right = recursive(preorder,  pStart + leftNodeCount + 1, pEnd, inorder, rootIndexInInorder + 1, iEnd);
        return root;
    }

    public int findIndex(int value, int[] targetArr) {
        int res = 0;
        for(int i = 0; i < targetArr.length; i++) {
            if(targetArr[i] == value) {
                res = i;
                break;
            }
        }
        return res;
    }
}