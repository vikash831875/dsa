class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0 ;
        int max =  0;
        for(int i =0 ;i<nums.length; i++){
            sum = sum +nums[i];
            if(sum>max){
                max = sum ;
            }
            if(i<nums.length -1 && nums[i]>=nums[i+1]){
                sum  = 0;
            }
        }
        return max;
    }
}