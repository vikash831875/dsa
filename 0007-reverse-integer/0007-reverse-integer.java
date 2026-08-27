class Solution {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int n = x;
        int rev =0 ;
        while(n!=0){
            if(rev>max/10 || rev <min/10){
                return 0;
            }
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;

        }
        return rev;
     
    }
}