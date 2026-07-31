class Solution {
    public int maxSubArray(int[] nums) {
      
      int bestInding = nums[0];
      int ans = nums[0];
      for(int i =1; i<nums.length ;i++){
        int v1 =  bestInding + nums[i];
        int v2 = nums[i];
        bestInding  = Math.max(v1,v2);
        ans = Math.max(ans, bestInding);
      }

      return ans;
    }
}
