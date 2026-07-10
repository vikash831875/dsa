class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit= 0 ;
       int minbuy=prices[0];
       for(int i =1 ; i<prices.length; i++){
        if(minbuy>prices[i]){
            minbuy=prices[i];
        }
        int profit = prices[i]-minbuy;

        if(profit>maxprofit){
            maxprofit=profit;
        }
       }
     return maxprofit;
    }
}
