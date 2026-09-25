class Solution {
        
 public static int min(int[] cost, int index, int dp[]){
    if(index >= cost.length ) return 0 ;

    if(dp[index] != -1) return dp[index];



    int x1 = min(cost, index+1, dp);
    int x2 = min(cost, index+2 , dp);
    int ans = cost[index]+ Math.min(x1,x2);

    dp[index]= ans;

    return ans;
 }
     
    

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

       return Math.min(min(cost, 0, dp),min(cost, 1, dp)) ;


       
        
    }
}