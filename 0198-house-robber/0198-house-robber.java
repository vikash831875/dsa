class Solution {
    // public static int robb(int nums[] , int index , int dp[]){
    //     if(index>=nums.length) return 0;

    //     if(dp[index] != -1) return dp[index];
    //     int ans =  nums[index] + robb(nums, index+2,dp);
    //     int skip = robb(nums,index+1,dp);

    //     int ans1 = Math.max(ans,skip);
    //     dp[index] = ans1;

        
    //     return  ans1;
    // }
    public int rob(int[] nums) {
        if(nums.length ==1)return nums[0];
        int n = nums.length;
        int dp[]= new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i<nums.length; i++){
           dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }


        // Arrays.fill(dp,-1);

        // return robb(nums,0,dp);

   return dp[n-1];
         
        
    }
}