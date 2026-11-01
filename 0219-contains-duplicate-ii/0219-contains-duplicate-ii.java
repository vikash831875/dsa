import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0 ; 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0 ; right<nums.length; right++){
            while(right-left>k){
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left])==0){
                map.remove(nums[left]);
                
             
            }
            left++;
               


            }
            if(map.containsKey(nums[right])){
              return true;

        }else{
            map.put(nums[right],1);
        }
            


        }
        

        return false;
    }
}