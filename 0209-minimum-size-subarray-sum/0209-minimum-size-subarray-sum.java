class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE ;
        int left =  0 ;
        int right = 0 ;
        int sum = 0 ;
        while(right<nums.length){
            sum  = sum + nums[right];
            while(sum>=target){
                int len  = (right-left)+1;
                if(len<result){
                    result=len;
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(result ==Integer.MAX_VALUE ){
            return 0;

        }
        return result;
        
    }
}