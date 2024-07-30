// class Solution {
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
        
//         int a =0;
//         int j = 0;
//         if(nums.length==1) return nums[0];
//         if(nums.length>=3){
//             for(int i=nums.length-1;i>=0;i--){
//                 j++;
//                 if(j==3) break;
//             }
//             a = nums[nums.length-j];
//         }
//         else{
//            if(nums[0]>nums[1]) a = nums[0];
//            else a = nums[1];
//         }
//         return a;
//     }
// }

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                c++;
            }
            if(c==2){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}