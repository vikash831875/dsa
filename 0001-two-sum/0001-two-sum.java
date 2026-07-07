class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int arr[] = new int[2];
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             arr = new int[]{i, j};  
        //             return arr;            
        //         }
        //     }
        // }
        // return arr;

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ;  i<nums.length; i++){
            mp.put(nums[i], i);
        }

        for(int i = 0 ; i<nums.length; i++){
            int num = nums[i];
            int rem = target - num;
            if(mp.containsKey(rem)){
                int index = mp.get(rem);
                if(index == i ) continue;
                return new int[]{i,index};
            }
        }

        return new int[]{};
    }
}
