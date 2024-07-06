class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int flip_count = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0 && i+2 < n){
                nums[i] = 1;

                if(nums[i+1] == 1){
                    nums[i+1] = 0;
                }
                else{
                    nums[i+1] = 1;
                }

                if(nums[i+2] == 1){
                    nums[i+2] = 0;
                }
                else{
                    nums[i+2] = 1;
                }
                flip_count ++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                return -1;
            }
        }
        return flip_count;
    }
}