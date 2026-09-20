class Solution {
    public static int mincost(int cost[], int index, int dp[]) {

        if (index >= cost.length) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        return dp[index] = cost[index] + Math.min(
            mincost(cost, index + 1, dp),
            mincost(cost, index + 2, dp)
        );
    }

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int dp[] = new int[n];

        Arrays.fill(dp, -1);

        return Math.min(
            mincost(cost, 0, dp),
            mincost(cost, 1, dp)
        );
    }
}