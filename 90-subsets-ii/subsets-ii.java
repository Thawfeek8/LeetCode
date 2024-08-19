class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subsets = 1<<n;
        for(int i=0;i<subsets;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0){
                    l.add(nums[j]);
                }
            }
            Collections.sort(l);
            set.add(l);
        }
        for(List<Integer> t:set){
            ans.add(t);
        }
        return ans;
    }
}