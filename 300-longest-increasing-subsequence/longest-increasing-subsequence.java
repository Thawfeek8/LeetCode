class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> l = new ArrayList<>();
        l.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int idx = LowerBound(l, nums[i]);
            if(idx == l.size()) l.add(nums[i]);
            else l.set(idx, nums[i]);
        }
        return l.size();
    }
    static int LowerBound(List<Integer> l, int x){
        int ans = l.size(); // hypothetical index;
        int low = 0;
        int high = l.size()-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(l.get(mid) >= x){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}