class Solution {
    public int removeDuplicates(int[] nums) {
        int left= 0;
        int right= 0;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }else{
                nums[left+1]=nums[right];
                left++;
                right++;
            }
        }

         return left+1;
    }
        
}