class Solution {
    public int maxProfit(int[] arr) {
        int left =0 ; 
        int right = 1; 
        int maxprofit= 0 ; 
        while(right!=arr.length){
            if(arr[right]>arr[left]){
                int profit = arr[right]-arr[left];
                maxprofit=Math.max(maxprofit,profit);
            }else{
                left=right;
            }
            right++;
        }

        return maxprofit;
      
    }
}
