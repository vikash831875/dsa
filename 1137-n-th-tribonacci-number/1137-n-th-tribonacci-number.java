class Solution {

    // public static int fib(int n, int dp[]){
    //     if(n<=1) return n;
    //     if(n ==2) return 1;

    //     if(dp[n]!= -1) return dp[n];

    //     int ans = fib(n-1,dp)+fib(n-2,dp)+fib(n-3,dp);
    //     dp[n] = ans;

    //     return ans;



    // }

    public int tribonacci(int n) {
        // int dp[] = new int[n+1];

        // Arrays.fill(dp,-1);

       
        // return fib(n,dp);

        if(n<=1) return n;
       if(n ==2) return 1;

       int n1 = 0 ; 
       int n2 =1; 
       int n3 = 1; 
       for(int i = 3; i<=n ; i++){
        int fib  = n1+n2+n3;
        n1=n2;
        n2=n3;
        n3 = fib;
       }
   return n3;

    }
}