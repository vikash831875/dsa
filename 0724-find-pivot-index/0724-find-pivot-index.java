class Solution {
    public int pivotIndex(int[] nums) {
    //   int n = nums.length ;
    //   int prev[] = new int[n];
    //   int suff[] = new int[n];
    //   prev[0] = 0;

    //    for(int i = 1; i<nums.length; i++){
    //     prev[i] = prev[i-1]+nums[i-1];
    //    }

    //    suff[n-1] = 0;

    //    for(int i = nums.length-2;i>=0; i--){
    //     suff[i] = suff[i+1]+nums[i+1];
    //    }
    //    int j = 0 ;
    //    while(j<prev.length && j<suff.length){
    //     if(prev[j]==suff[j]){
    //         return j;
    //     }
    //     j++;
    //    }
    //    return -1;

    int left =0 ;
    int sum =0 ;
    for(int i   = 0  ; i<nums.length; i++){
        sum= sum+nums[i];
    }

    for(int i = 0; i<nums.length; i++){
        int right = sum -left-nums[i];
        if(left == right){
            return i ;
        }

        left = left+nums[i];
    }
   return -1;
    }
}
