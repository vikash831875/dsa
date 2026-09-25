class Solution {
    public int[] searchRange(int[] nums, int target) {

        int f = first(nums,target);
        int l = last(nums,target);
        return new int[]{f,l};
    }

        public static int first(int nums[] , int target){
            int ans = -1; 
            int left =0 ;
            int right = nums.length-1;
            while(left<=right){
                int mid = left+(right-left)/2;

                if(nums[mid]==target){
                    ans = mid; 
                    right = mid-1;
                }else if(nums[mid]<target){
                    left = mid+1;
                }else {
                    right  = mid -1;
                }
            }

            return ans;
        }
        public static int last(int nums[] , int target){
            int ans = -1; 
            int left =0 ;
            int right = nums.length-1;
            while(left<=right){
                int mid = left+(right-left)/2;

                if(nums[mid]==target){
                    ans = mid; 
                    left = mid+1;
                }else if(nums[mid]<target){
                    left = mid+1;
                }else {
                    right  = mid -1;
                }
            }

            return ans;
        }


        
    
}