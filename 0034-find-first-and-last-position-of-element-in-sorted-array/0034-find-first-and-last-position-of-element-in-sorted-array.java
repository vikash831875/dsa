class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first = -1; 
        int last = -1 ;
        int left =0 ; 
        int right = arr.length-1;
        
        // first occurnace 
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        // last occurance 
         left =0 ; 
         right = arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid] == target){
                last = mid;
                left = mid+1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return new int[]{first,last};

    }
}