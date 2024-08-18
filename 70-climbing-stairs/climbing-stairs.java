class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ducati(n, dp);
    }
    static int ducati(int n, int[] dp){
        if(n==0||n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n] = ducati(n-1,dp)+ducati(n-2,dp);
        return dp[n];





        
    }
}