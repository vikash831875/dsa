class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0 ; 
        int left =0 ; 
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            while(right-left+1>3){
               
                char le = s.charAt(left);
                map.put(le,map.get(le)-1);
                if(map.get(le)==0){
                    map.remove(le);
                }
                left++;
            
                 
            }
            if(right-left+1 ==3 && map.size()==3){
                count++;
            }
           
        }

        return count;
        
    }
}