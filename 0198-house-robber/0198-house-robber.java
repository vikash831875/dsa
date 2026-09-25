class Solution {
    public static int robb(int nums[] , int index , int dp[]){
        if(index>=nums.length) return 0;

        if(dp[index] != -1) return dp[index];
        int ans =  nums[index] + robb(nums, index+2,dp);
        int skip = robb(nums,index+1,dp);

        int ans1 = Math.max(ans,skip);
        dp[index] = ans1;

        
        return  ans1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);

        return robb(nums,0,dp);


         
        
    }
}