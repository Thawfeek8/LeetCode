class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        fun(0, ans, l, nums);
        return ans;
    }
    static void fun(int i, List<List<Integer>> ans, List<Integer>l, int[]arr){
        if(i == arr.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        fun(i+1, ans, l, arr);
        l.remove(l.size()-1);
        fun(i+1, ans, l, arr);
    }
}







// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         int n = nums.length;
//         int subsets = 1<<n;
//         List<List<Integer>> ans = new ArrayList<>();
        
//         for(int i=0;i<subsets;i++){
//             List<Integer> l = new ArrayList<>();
//             for(int j=0;j<n;j++){
                
//                 if((i & (1 << j))>0){
//                     l.add(nums[j]);
//                 }
//             }
//             ans.add(l);
//         }
//         return ans;
        
//     }
// }