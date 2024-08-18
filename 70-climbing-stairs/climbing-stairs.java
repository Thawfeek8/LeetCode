class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ducati(n, dp);
    }
    static int ducati(int n, int[] dp){
        if(n==0||n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int a = ducati(n-1,dp);
        int b = ducati(n-2,dp);
        dp[n] = a+b;
        return dp[n];





        
    }
}