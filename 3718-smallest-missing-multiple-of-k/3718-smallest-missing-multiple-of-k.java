class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int expected = k ;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i]== expected){
                expected = expected + k;
            }
        }

        return expected;
       
    }
}