class Solution {
    public int totalFruit(int[] fruits) {
        int maximum =0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0 ;right<fruits.length; right++){
            int a = fruits[right];
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }

            while(map.size()>2){
                 int b =fruits[left];
                map.put(b, map.get(b)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
                 left++;
                
            }
            maximum = Math.max(maximum,right-left+1);
               

        } 
        return maximum;
        
    }
}