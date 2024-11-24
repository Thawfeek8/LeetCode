import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        // Edge case: if fewer than 4 elements, return empty list
        if (n < 4) return ans;

        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < n; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        // Add the valid quadruplet
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;
                        l--;

                        // Skip duplicates for the third element
                        while (k < l && nums[k] == nums[k - 1]) k++;

                        // Skip duplicates for the fourth element
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) {
                        k++; // Increase the sum
                    } else {
                        l--; // Decrease the sum
                    }
                }
            }
        }

        return ans;
    }
}










// Better approach not optimal

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Set<List<Integer>> st = new HashSet<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 Set<Long> s = new HashSet<>();
//                 for(int k=j+1;k<n;k++){
//                     long sum = nums[i]+nums[j];
//                     sum += nums[k];
//                     long fourth = target - sum;
//                     if(s.contains(fourth)){
//                         List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
//                     Collections.sort(l);
//                     st.add(l);
//                     }
//                     s.add((long)nums[k]);
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         for(List<Integer> d:st){
//             ans.add(d);
//         }
//         return ans;
//     }
// }