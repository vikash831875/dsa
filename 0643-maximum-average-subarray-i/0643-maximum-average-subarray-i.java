
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxavg = Integer.MIN_VALUE;

        int left = 0;
        double sum = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {

                double avg = sum / k;

                maxavg = Math.max(maxavg, avg);
            }
        }

        return maxavg;
    }
}
