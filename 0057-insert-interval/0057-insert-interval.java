class Solution {
    public int[][] insert(int[][] arr, int[] newarr) {
        List<int[]> result = new ArrayList<>();
        int start2 = newarr[0];
        int end2 = newarr[1];

        for(int i =0 ; i<arr.length; i++){
            int start1 = arr[i][0];
            int end1 = arr[i][1];
            if(end1<start2){
                result.add(new int[]{start1,end1});
            }else if(start1>end2){
                result.add(new int[]{start2,end2});
                for(int j = i  ; j<arr.length; j++){
                    result.add(arr[j]);
                }
                return result.toArray( new int[result.size()][]);
            }
            else{
                start2 = Math.min(start1, start2);
                end2 = Math.max(end1, end2);
            }
        }

        result.add(new int[]{start2, end2});
         return result.toArray( new int[result.size()][]);
        
    }
}