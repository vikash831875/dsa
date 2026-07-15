class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
     int maxlen = 0;
     int left = 0 ;
     HashMap<Character, Integer> map = new HashMap<>();
     for(int right = 0 ; right<n; right++){
        char ch = s.charAt(right);

        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }

        while(map.size()<right-left+1){
            char leftch=s.charAt(left);
            map.put(leftch, map.get(leftch)-1);
            if(map.get(leftch)==0){
                map.remove(leftch);
            }
            left++;
        }
        if(map.size()== right-left+1){
            maxlen = Math.max(maxlen,right-left+1);
        }


     }
     return maxlen;

    }
}