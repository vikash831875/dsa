class Solution {
    public int minimumRecolors(String str, int k) {
        int ans = Integer.MAX_VALUE ; 
        int left  = 0 ; 
        HashMap<Character,Integer>map = new HashMap<>();
        for(int right=0; right<str.length();right++){
            char ch = str.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

            while(right-left+1>k){
                char le = str.charAt(left);
                map.put(le,map.get(le)-1);
                if(map.get(le)==0){
                    map.remove(le);
                }
                left++;
            }
            int white = 0 ; 
            if(map.containsKey('W')){
                white = map.get('W');
            }
            if(right-left+1==k){
                ans = Math.min(ans,white);
            }
        }

    if(ans== Integer.MAX_VALUE ) return 0;

    return ans;
        
    }
}