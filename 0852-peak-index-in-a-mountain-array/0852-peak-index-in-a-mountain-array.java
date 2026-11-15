class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans =-1;
        int max = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i] ; 
                ans = i;
            }
        }
        return ans;
    }
}