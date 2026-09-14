class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0 ;
        int arr1[]= new int[a];
        int arr2[] = new int[b];
        int ind1=0;
        int ind2=0;

        for(int i =1 ; i<=a; i++){
            if(a%i==0){
                arr1[ind1++]=i;
            }
        }
          for(int i =1 ; i<=b; i++){
            if(b%i==0){
                arr2[ind2++] = i;
            }
        }
        for(int i = 0 ; i<ind1; i++){
            for(int j = 0 ; j<ind2; j++){
                if(arr1[i]==arr2[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}