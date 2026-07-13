class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[]= arr.clone();
        Arrays.sort(sorted);
        int rank=1;

        HashMap<Integer,Integer> mp  = new HashMap<>();
        for(int num : sorted){
            if(!mp.containsKey(num)){
                mp.put(num,rank++);
            }
        }
        int ans[] = new int[arr.length];
        for(int i=0  ; i<sorted.length; i++){
            ans[i] = mp.get(arr[i]);
        }
     return ans ;
      
    }
}