class Solution {
    public int lengthOfLongestSubstring(String s) {
     int maxlength= 0 ; 
     HashMap<Character,Integer>map = new HashMap<>();
     int left=0;
     for(int i =0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
        while(map.get(ch)>1){
            char le =s.charAt(left);
            map.put(le,map.get(le)-1);

            if(map.get(le)==0){
                map.remove(le);
            }
            left++;
        }
        maxlength=Math.max(i-left+1,maxlength);
     }
     return maxlength;
    }
}