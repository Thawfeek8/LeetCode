class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int[] hash = new int[n];
        List<Integer> l = new ArrayList<>();
        fun(0, ans, l, hash, nums, n);
        return ans;
    }
    static void fun(int idx,  List<List<Integer>> ans, List<Integer> l, int[] hash, int[] arr, int n){
        if(idx == n){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<n;i++){
            if(hash[i] == 0){
                l.add(arr[i]);
                hash[i] = 1;
                fun(idx+1, ans, l, hash, arr, n);
                l.remove(l.size()-1);
                hash[i] = 0;
            }
        }
    }
}