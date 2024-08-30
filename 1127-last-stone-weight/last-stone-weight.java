class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int a:stones){
            q.add(a);
        }
        while(q.size()>1){
            int x = q.poll();
            int y = q.poll();
            if(x!=y) q.add(x-y);
            if(x==y) continue;
        }
        if(q.isEmpty()) return 0;
        return q.poll();
    }
}