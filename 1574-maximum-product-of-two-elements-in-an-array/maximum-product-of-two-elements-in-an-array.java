class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-2]-1) * (nums[n-1]-1);
        
    }
}
        
// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int first_max = Integer.MIN_VALUE;
//         int second_max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(nums[i] > first_max){
//                 second_max = first_max;
//                 first_max = nums[i];
//             }
//             else if(nums[i]>second_max && nums[i]<=first_max){
//                 second_max = nums[i];
//             }
//         }
//         return (first_max - 1)*(second_max - 1);
//     }
// }  