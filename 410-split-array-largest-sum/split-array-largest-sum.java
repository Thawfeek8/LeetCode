class Solution {
    public int splitArray(int[] nums, int k) {
        int l = Integer.MIN_VALUE;
        for(int a:nums){
            l = Math.max(l, a);
        }
        int h = 0;
        for(int a:nums){
            h += a;
        }
        int ans = 0;
        while(l <= h){
            int mid = (l+h)/2;
            if(helper(nums, mid) <= k){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    static int helper(int[] arr, int mid){
        int res = 1;
        int sum = 0;
        for(int a:arr){
            if(a+sum > mid){
                res++;
                sum = a;
            }
            else sum += a;
        }
        return res;
    }
}