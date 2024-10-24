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
    public int kthSmallest(TreeNode root, int k) {
        TreeSet<Integer> t = new TreeSet<>();
        call(root, t);
        for(int i=0;i<k-1;i++){
            t.pollFirst();
        }
        return t.pollFirst();
    }
    static void call(TreeNode root, TreeSet<Integer> l){
        if(root == null) return;
        
        l.add(root.val);
        call(root.left, l);
        call(root.right, l);
    }
}