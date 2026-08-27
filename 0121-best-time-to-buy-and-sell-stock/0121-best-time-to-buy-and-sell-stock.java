class Solution {
    public int maxProfit(int[] arr) {
       int maxprofit = 0 ; 
       int bestbuy = arr[0];
       for(int i = 1 ; i<arr.length; i++){
        if(bestbuy>arr[i]){
            bestbuy = arr[i];
        }
        int profit = arr[i]- bestbuy ; 
        maxprofit = Math.max(maxprofit , profit);
       }
       return maxprofit;
    }
}
