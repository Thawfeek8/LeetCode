class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
         reverse(nums, 0, nums.length - 1);      
        reverse(nums, 0, k - 1);                
        reverse(nums, k, nums.length - 1);
    }
    static void reverse(int[] nums, int st, int en){
        while(st<en){
            int temp = nums[st];
            nums[st] = nums[en];
            nums[en] = temp;
            st++;
            en--;
        }
    }
}