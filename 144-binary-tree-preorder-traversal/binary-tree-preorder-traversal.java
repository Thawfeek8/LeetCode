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
class Solution {List<Integer> list= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
    //     if(root==null){
    //         return new ArrayList<>();
    //     }
    //     list.add(root.val);
    //    preorderTraversal(root.left);
       
    //    preorderTraversal(root.right);
    //    return list;
    if(root==null) return list;
    Stack<TreeNode> st = new Stack<>();
    st.push(root);
    while(!st.isEmpty()){
        root = st.pop();
        list.add(root.val);
        if(root.right!=null) st.push(root.right);
        if(root.left!=null) st.push(root.left);
    }return list;
    }
}