class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> s = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if(s.contains(fourth)){
                        List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
                    Collections.sort(l);
                    st.add(l);
                    }
                    s.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> d:st){
            ans.add(d);
        }
        return ans;
    }
}