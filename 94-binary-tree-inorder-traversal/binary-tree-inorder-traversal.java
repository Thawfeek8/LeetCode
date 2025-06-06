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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> l = new ArrayList<>();
        // Stack<TreeNode> st = new Stack<>();
        // TreeNode dummy = root;
        // while(true){
        //     if(dummy != null){
        //         st.push(dummy);
        //         dummy = dummy.left;
        //     }
        //     else{
        //         if(st.isEmpty()) break;
        //         dummy = st.pop();
        //         l.add(dummy.val);
        //         dummy = dummy.right;
        //     }
        // }
        // return l;
        solve(l, root);
        return l;
    }
    static void solve(List<Integer> l, TreeNode root){
        if(root == null) return;
        solve(l, root.left);
        l.add(root.val);
        solve(l, root.right);
    }

}