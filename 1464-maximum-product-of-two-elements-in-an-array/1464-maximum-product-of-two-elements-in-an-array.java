class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = nums.length-1;
        int smax = nums.length-2;
        return (nums[max]-1)*(nums[smax]-1);
        
    }
}