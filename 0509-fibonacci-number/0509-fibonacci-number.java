class Solution {
    public int fib(int n) {

        int a = 0 ; 
        int b =1; 

       for (int i = 0; i < n; i++) {
        int fib = a + b;
        a = b;
        b = fib;
    }
        return a;

    //    return fib(n-1)+fib(n-2);
        
    }
}