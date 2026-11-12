class Solution {
    public int maxArea(int[] arr) {
        int maxarea = 0; 
        int left=0 ; 
        int right=arr.length-1;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left],arr[right]);
            int area = width*height;
            maxarea=Math.max(maxarea,area);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxarea;
    
    }
}
