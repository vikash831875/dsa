class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int  i  =0 ; i<nums.length  ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int middle = nums[nums.length / 2];
        if (map.get(middle) == 1) {
            return true;
        } else {
            return false;
        }
    }
}