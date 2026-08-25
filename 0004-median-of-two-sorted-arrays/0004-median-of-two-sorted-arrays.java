class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i=0 ;
        int j = 0 ;
        int index =0;
        int ans[] = new int[n+m];
        
        while(i<n && j <m){
            if(nums1[i]<nums2[j]){
                ans[index++] = nums1[i];
                i++;

            }else{
                ans[index++] = nums2[j];
                j++;
            }
        }

        while(i<n){
            ans[index++]=nums1[i++];
        }

        while(j<m){
            ans[index++]= nums2[j++];
        }

        int z = ans.length;
        if(z%2 != 0 ){
            return ans[z/2];
        }

        return (ans[z / 2 - 1] + ans[z / 2]) / 2.0;

       
    }
}