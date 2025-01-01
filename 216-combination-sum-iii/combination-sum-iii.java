class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        sol(k, n, ans, l, 1, 0);
        return ans;
    }
    static void sol(int k, int n, List<List<Integer>> ans, List<Integer> l, int idx, int sum){
        if(l.size() == k){
            if(sum == n){
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        for(int i=idx;i<10;i++){
            l.add(i);
            sum += i;
            sol(k, n, ans, l, i+1, sum);
            sum -= i;
            l.remove(l.size()-1);
        }
    }
}