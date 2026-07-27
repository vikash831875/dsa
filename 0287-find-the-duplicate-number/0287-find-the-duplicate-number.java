class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i =0 ; i<nums.length; i++){
    //         if(map.containsKey(nums[i])){
    //             map.put(nums[i],map.get(nums[i])+1);
    //         }else{
    //             map.put(nums[i],1);
    //         }
    //     }
    //     int n = nums[0];
    //   for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //     if(entry.getValue()>1){
    //         n = entry.getKey();

    //     }
    //   }

    //   return n;
    int n =nums[0];
    for(int i = 0 ;i<nums.length-1; i++){
        if(nums[i]==nums[i+1]){
            n = nums[i];
        }
    }
   return n;
    }
}