class Solution {
    // public static int fibo(int n, int dp[]){
    //     // if(n ==0) return 0; 
    //     // if(n==1) return 1; 
    //     // if(dp[n]!=0) return dp[n];
    //     // int ans = fibo(n-1,dp) + fibo(n-2,dp);
    //     // dp[n] = ans;
    //     // return ans;

        

    // }
    public int fib(int n) {
        // int dp[] = new int[n+1];
        // return fibo(n,dp);
        if(n<=1) return n ;

        int dp[] = new int[n+1];
       dp[0] = 0 ; 
       dp[1] =1;
       for(int i =2 ; i<dp.length; i++){
           dp[i] = dp[i-1]+dp[i-2];
           
       }

       return dp[n];


        
    }
}