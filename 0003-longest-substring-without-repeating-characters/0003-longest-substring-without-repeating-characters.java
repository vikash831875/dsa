class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
     int left = 0 ;
     int maxlen = 0 ;
     for(int right = 0 ; right<s.length(); right++){
        char ch = s.charAt(right);
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
     


        while(map.size()<right-left+1){
            char lch = s.charAt(left);
            map.put(lch, map.get(lch)-1);
            if(map.get(lch)==0){
                map.remove(lch);
            }
            left++;
            
        }
       maxlen = Math.max(maxlen, right-left+1);
        
     }
     return maxlen;
     
    }
}