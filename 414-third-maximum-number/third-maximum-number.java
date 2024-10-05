class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> ts = new TreeSet<>();
        for(int a:nums){
            ts.add(a);
        }
        if(ts.size()>=3){
        ts.pollLast();
        ts.pollLast();
        return ts.pollLast();
        }
        else return ts.pollLast();
    }
}