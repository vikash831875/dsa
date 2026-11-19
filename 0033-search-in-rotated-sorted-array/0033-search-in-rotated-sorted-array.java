class Solution {
    public static int binarysearch(int nums[],int left , int right,int target){
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right= mid-1;
            }
        }
        return -1;
    }

    public static int pivot(int nums[], int left , int right ){
        int ans =-1;
        int n = nums.length;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[n-1]>=nums[mid]){
                right = mid-1;
            }else{
                ans = mid;
                left = mid+1;
            }

        }
        return ans;

    }
    public int search(int[] nums, int target) {
        int n = nums.length;

    int p = pivot(nums, 0, n-1);

    int ans = binarysearch(nums, 0, p, target);

    if(ans == -1) {
        ans = binarysearch(nums, p+1, n-1, target);
    }

    return ans;
    }
}