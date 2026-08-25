class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       int maxlength =0;
       int left =0 ;
       for(int i =0 ; i<s.length(); i++){
        char rch = s.charAt(i);
        if(map.containsKey(rch)){
            map.put(rch, map.get(rch)+1);
        }else{
            map.put(rch, 1);
        }

        while(map.get(rch)>1){
            char lch = s.charAt(left);
            map.put(lch, map.get(lch)-1);
            if(map.get(lch)==0){
                map.remove(lch);
            }
            left++;
        }
        maxlength = Math.max(maxlength, i-left+1);
        
       }

       return maxlength;
     
    }
}