class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int ind1 = 0;
        int ind2 = 0;

        arr1[ind1++] = nums[0];
        arr2[ind2++] = nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[ind1 - 1] > arr2[ind2 - 1]) {
                arr1[ind1++] = nums[i];
            } else {
                arr2[ind2++] = nums[i];
            }
        }

        int[] ans = new int[n];

        for (int i = 0; i < ind1; i++) {
            ans[i] = arr1[i];
        }

        for (int i = 0; i < ind2; i++) {
            ans[ind1 + i] = arr2[i];
        }

        return ans;
    }
}