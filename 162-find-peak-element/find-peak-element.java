class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int idx = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }
        return idx;
        // int l = 0;
        // int r = nums.length-1;
        // int mid = 0;
        // while(l<r){
        //     mid = (l+r)/2;
        //     if(nums[mid]>nums[mid+1]) r = mid;
        //     else l = mid+1;

        // }
        // return r;
    }
}