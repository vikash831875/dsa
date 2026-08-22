class Solution {
    public int[][] intervalIntersection(int[][] arr, int[][] arr1) {
        List<int[]> result = new ArrayList<>();
        int i  = 0 ; 
        int j =0 ; 
        while(i<arr.length && j<arr1.length){
            int start1 = arr[i][0];
            int end1 = arr[i][1];
            int start2 = arr1[j][0];
            int end2 =  arr1[j][1];

            int start  = Math.max(start1, start2);
            int end = Math.min(end1, end2);

            if(start<=end){
                result.add(new int[]{start, end});
            }

            if(end1<end2){
                i++;
            }else{
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}