class Solution {
    public static int sum (int arr[][], int m, int n, int dp[][] ){
        if(m>=arr.length || n>= arr[0].length)return Integer.MAX_VALUE;;
      if (m == arr.length - 1 && n == arr[0].length - 1) {
            return arr[m][n];
        }

       if(dp[m][n] != -1) return dp[m][n];
        int rsum = sum(arr,m,n+1,dp);
        int lsum = sum(arr,m+1,n,dp);
        int ans = arr[m][n] + Math.min(rsum,lsum);
        dp[m][n]= ans;
        return ans;

    }
    public int minPathSum(int[][] arr) {
        int dp[][]= new int[arr.length][arr[0].length];
        for(int i =0 ; i<arr.length; i++){
            Arrays.fill(dp[i],-1);
        }

        return sum(arr,0,0,dp);
       
    }
}