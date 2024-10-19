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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        rs(root, 0, l);
        return l;
    }

    static void rs(TreeNode node, int col, List<Integer> l) {
        if (node == null) return;
        if (col == l.size()) l.add(node.val);
        rs(node.right, col + 1, l);
        rs(node.left, col + 1, l);
    }
}
