class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
    // static int ducati(int n, int[] dp){
    //     if(n==0||n==1) return 1;

    //     if(dp[n]!=-1) return dp[n];

    //     int a = ducati(n-1,dp);
    //     int b = ducati(n-2,dp);
    //     dp[n] = a+b;
        
    //     return dp[n];
    // }
}

