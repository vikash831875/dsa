class Solution {
    public int pivotIndex(int[] nums) {
      int n = nums.length ;
      int prev[] = new int[n];
      int suff[] = new int[n];
      prev[0] = 0;

       for(int i = 1; i<nums.length; i++){
        prev[i] = prev[i-1]+nums[i-1];
       }

       suff[n-1] = 0;

       for(int i = nums.length-2;i>=0; i--){
        suff[i] = suff[i+1]+nums[i+1];
       }
       int j = 0 ;
       while(j<prev.length && j<suff.length){
        if(prev[j]==suff[j]){
            return j;
        }
        j++;
       }
       return -1;
    }
}
