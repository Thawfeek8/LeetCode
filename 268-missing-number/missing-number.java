class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans ^= nums[i];
            ans ^= i+1;
        }
        
        return ans;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         int[] nums1 = new int[nums.length+1];
//         int ans = 0;
//         Arrays.fill(nums1,-1);
//         for(int i=0;i<nums.length;i++){
//             nums1[nums[i]] = nums[i];
//         }
//         for(int i=0;i<nums1.length;i++){
//             if(nums1[i] == -1){
//                 ans = i;
//             }
//         }
//         return ans;
//     }
// }
