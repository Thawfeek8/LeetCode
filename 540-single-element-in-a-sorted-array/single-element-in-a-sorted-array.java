class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int l = 1;
        int h = n-2;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            //left part (even index,odd index)->eleiminate the left serach space
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])) l = mid+1;
            //right part (odd index, even index)->eliminate the right search space
            else h = mid-1;
        }
        return -1;
    }
}