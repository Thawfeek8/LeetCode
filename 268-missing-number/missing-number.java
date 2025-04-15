class Solution {
    public int missingNumber(int[] nums) {
        // using cyclic sort

        int n = nums.length;
        int i=0;
        while(i<n){
            int correctIndex = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
            else i++;
        }

        for(int index=0;index<n;index++){
            if(index != nums[index]) return index;
        }
        return n;
    }
    static void swap(int[]arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}