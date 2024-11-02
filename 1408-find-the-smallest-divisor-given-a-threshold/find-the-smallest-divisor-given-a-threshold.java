class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int a:nums){
            max = Math.max(a, max);
        }
        int ans = -1;
        int l = 1;
        int h = max;
        while(l <= h){
            int mid = (l+h)/2;
            if(helper(nums, mid) <= threshold){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    static int helper(int[] nums, int divisor){
        int ans = 0;
        for(int i:nums){
            ans += (int)Math.ceil((double)i/divisor);
        }
        return ans;
    }
}