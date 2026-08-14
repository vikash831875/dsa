class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0 ;
        int ans  = 0 ;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0 ; right<s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

            while(map.get(ch)>2){
                char lch  = s.charAt(left);
                map.put(lch, map.get(lch)-1);
                left++;

            }
            ans = Math.max(ans, right-left+1);
        }

        return ans;
        
    }
}