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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalans=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null)return finalans;
        queue.offer(root);
        while(queue.size()!=0){
            int levelnum=queue.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<levelnum;i++){
              if(queue.peek().left!=null){
                queue.offer(queue.peek().left);
              }
              if(queue.peek().right!=null){
                queue.offer(queue.peek().right);
              }
              ans.add(queue.poll().val);
            }
            finalans.add(ans);
        }

        return finalans;
    }
}