class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp =  new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,n,dp);
        
    }
    public static int helper(int[] nums,int n,int[] dp){
        
        if(n<=0) return 0;
        if(dp[n] != -1) return dp[n];

        int pick = nums[n-1]+helper(nums,n-2,dp);
        int not_pick = helper(nums,n-1,dp);
        return dp[n] = Math.max(pick,not_pick);
    }
}