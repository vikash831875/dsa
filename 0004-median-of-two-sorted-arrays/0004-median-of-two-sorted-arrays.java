class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[n + m];

        int i = 0, j = 0, index = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ans[index++] = nums1[i++];
            } else {
                ans[index++] = nums2[j++];
            }
        }

        while (i < n) {
            ans[index++] = nums1[i++];
        }

        while (j < m) {
            ans[index++] = nums2[j++];
        }

        int s = ans.length;

        if (s % 2 == 1) {
            return ans[s / 2];
        } else {
            return (ans[s / 2 - 1] + ans[s / 2]) / 2.0;
        }
    }
}