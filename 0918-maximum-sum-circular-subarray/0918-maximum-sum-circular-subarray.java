class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int ans = nums[0];
        int maxend = nums[0];
        int minend = nums[0];

        int maxsum = nums[0];
        int minsum = nums[0];

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum += nums[i];

            int v1 = nums[i];
            int v2 = maxend + nums[i];
            int v3 = minend + nums[i];

            maxend = Math.max(v1, v2);
            minend = Math.min(v1, v3);

            maxsum = Math.max(maxsum, maxend);
            minsum = Math.min(minsum, minend);
        }

        if (maxsum < 0)
            return maxsum;

        ans = Math.max(maxsum, sum - minsum);

        return ans;
    }
}