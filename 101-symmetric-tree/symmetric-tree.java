/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isit(root.left, root.right);
    }
    static boolean isit(TreeNode node1, TreeNode node2){
        if(node1 == null || node2 == null) return node1 == node2;
        if(node1.val != node2.val) return false;
        boolean  leftsubtree = isit(node1.left, node2.right);
        boolean rightsubtree = isit(node1.right, node2.left);
        return leftsubtree && rightsubtree;
    }
}