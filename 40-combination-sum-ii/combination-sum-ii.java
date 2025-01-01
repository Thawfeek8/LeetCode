class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        fun(0, ans, l, candidates, candidates.length, target);
        return ans;
    }
    static void fun(int idx, List<List<Integer>> ans, List<Integer> l, int[]arr, int n, int target){
        if(target == 0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<n;i++){
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            l.add(arr[i]);
            fun(i+1, ans, l, arr, n, target-arr[i]);
            l.remove(l.size()-1);
        }
    }
}