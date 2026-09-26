class Solution {
    public static int robb(int nums[], int index,int end, int dp[]){
        if(index>end) return 0;

        if(dp[index] != -1 ) return dp[index];

        int thip = nums[index]+ robb(nums,index+2,end,dp);
        int skip = robb(nums,index+1,end,dp);
        int ans = Math.max(thip,skip);

        dp[index] = ans;

        return ans;


    }
    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
        int n = nums.length;
        int dp1[] = new int[n];
        Arrays.fill(dp1,-1);

         int dp2[] = new int[n];
        Arrays.fill(dp2,-1);

        int case1 = robb(nums,0,n-2,dp1);
        int case2 = robb(nums,1,n-1,dp2);

        return Math.max(case1,case2);

        

        
    }
}