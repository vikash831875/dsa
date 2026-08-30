class Solution {
    public int minimumDeletions(int[] arr) {
        int n = arr.length; 
        int minIndex = 0 ;
        int maxIndex = 0 ; 
        for(int i=0 ; i < arr.length; i++){
            if(arr[i]<arr[minIndex]){
                minIndex = i ;
            }
            if(arr[i]>arr[maxIndex]){
                maxIndex = i ;
            }

            
            
        }
        int left = Math.min(minIndex, maxIndex);
            int right = Math.max(minIndex, maxIndex);

            int front = right+1;
            int back = n-left;
            int both = left+1 + n-right; 

        return Math.min(front, Math.min(back, both));
    }
}