class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxsum =0 ; 
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0 ; 
        long sum = 0 ; 
        for(int right =0; right<nums.length; right++){
            if(map.containsKey(nums[right])){
                map.put(nums[right], map.get(nums[right])+1);
            }else{
                map.put(nums[right],1);
            }

            sum  = sum + nums[right];

            while(right-left+1>k || map.get(nums[right])>1 ){
                   map.put(nums[left], map.get(nums[left])-1);
                   

                   if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                   }

                   sum = sum - nums[left];

                   left++;

                   
            }
           if(right-left+1 == k){
             maxsum = Math.max(sum,maxsum);
           }
        }

        return maxsum;
        
    }
}