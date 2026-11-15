class Solution {
    public int search(int[] nums, int target) {

        int ans = -1;
        int left = 0;
        int n = nums.length - 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[n] < target) {

                if (nums[mid] < target && nums[mid] > nums[n]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            } else {

                if (nums[mid] > target && nums[mid] <= nums[n]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return ans;
    }
}