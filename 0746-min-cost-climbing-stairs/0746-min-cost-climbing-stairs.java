class Solution {
    public static int mincost(int cost[], int index, int dp[]){
        if(index <=1) return cost[index];
     if(dp[index]!= -1) return dp[index];

     return dp[index] =cost[index] + Math.min (  mincost(cost, index-1,dp),(mincost(cost, index-2,dp)));

    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,n-1,dp), mincost(cost,n-2,dp));

        
    }
}