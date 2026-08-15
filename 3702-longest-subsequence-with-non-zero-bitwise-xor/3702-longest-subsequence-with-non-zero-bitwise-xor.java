class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];

            if (nums[i] != 0) {
                nonZero++;
            }
        }

        if (xor != 0) {
            return n;
        }

        if (nonZero == 0) {
            return 0;
        }

        return n - 1;
    }
}