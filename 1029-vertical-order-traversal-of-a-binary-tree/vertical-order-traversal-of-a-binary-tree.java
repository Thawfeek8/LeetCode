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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple dummy = q.poll();
            TreeNode node = dummy.node;
            int row = dummy.row;
            int col = dummy.col;

            // populating the map
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<Integer>());
            map.get(col).get(row).offer(node.val);

            if(node.left != null) q.offer(new Tuple(node.left, row+1, col-1));
            if(node.right != null) q.offer(new Tuple(node.right, row+1, col+1));
        }
        // retuening in 2d list
        for(TreeMap<Integer, PriorityQueue<Integer>> spy:map.values()){
            List<Integer> l = new ArrayList<>();
            for(PriorityQueue<Integer> pq: spy.values()){
                while(!pq.isEmpty()){
                    l.add(pq.poll());
                }
            }
            ans.add(l);
        }

        return ans;

        
    }
}
class Tuple{
    TreeNode node;
    int row;
    int col;
    Tuple(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}