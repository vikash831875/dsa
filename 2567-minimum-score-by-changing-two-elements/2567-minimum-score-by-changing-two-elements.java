class Solution {
    public int minimizeSum(int[] arr) {
       int n = arr.length;
        Arrays.sort(arr);
        
        // if start two element changes 
        int high1=arr[n-1] - arr[2];

        // if last two element changes
        int high2 = arr[n-3]-arr[0];

        // if one from start and one from end
        int high3 = arr[n-2]-arr[1]; 

        int ans = Math.min(high1,Math.min(high2,high3));

        return ans;
        
        
    }
}