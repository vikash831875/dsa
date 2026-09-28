class Solution {
    public static int climb(int n, int dp[]){
        if(n ==1) return n; 
        if(n==2) return n ; 
        if(dp[n]!= -1) return dp[n];
        int ans = climb(n-1,dp)+climb(n-2,dp);
        dp[n]= ans;
        return ans ;

    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        return climb(n,dp);


        
        
        
    }
}