class Solution {
    public boolean checkDivisibility(int n) {
        int x = n ; 
        int sum = 0 ;
        int pro = 1;
        while(x >0 ){
            int digit = x%10;
            sum = sum + digit;
            pro = pro * digit ;
            x = x/10;

        }
        int total = sum + pro;
        if(n%total == 0){
            return true;
        }
       else{
        return false;
       }
        
    }
}