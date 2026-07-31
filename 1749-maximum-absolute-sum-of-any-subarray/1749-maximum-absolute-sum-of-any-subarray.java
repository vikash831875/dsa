class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int ans  = Math.abs(nums[0]);
        int maxindex = nums[0];
        int minindex = nums[0];
        for(int i = 1; i<nums.length; i++){
        
            int v1 = nums[i];
            int v2 = maxindex+nums[i];
            int v3 = minindex+nums[i];
            maxindex = Math.max(v1,v2);
            minindex = Math.min(v1,v3);
            ans = Math.max(ans,Math.max(maxindex,Math.abs(minindex)));
        }

        return ans;
        
    }
}