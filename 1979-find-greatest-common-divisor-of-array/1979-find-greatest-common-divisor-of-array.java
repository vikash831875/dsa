class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int l =0 ;
       
            s = nums[0];
            l = nums[nums.length-1];

        

        while(l%s !=0){
            int rem = l%s;
        l = s;
        s=rem;
        }

     return s;
     
        
    }
}