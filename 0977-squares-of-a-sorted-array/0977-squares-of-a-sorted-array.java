import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        // int ans[] = new int[nums.length];

        // for(int i =0 ;i<nums.length; i++){
        //     ans[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(ans);

        // return ans;

           int arr[] = new int[nums.length];
           int left =0 ; 
           int right = nums.length-1;
           int index =  nums.length-1;
           while(left<=right){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];
            if(leftsquare>rightsquare){
                arr[index--]=leftsquare;
                left++;
            }
            else{
                arr[index--]=rightsquare;
                right--;
            }
           }
           return arr;
        
    }
}