class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int x = Math.min(str1.length(),str2.length());
        for(int i = 0 ; i<x; i++ ){
            if(str1.charAt(i)==str2.charAt(i)){
                str=str+ str1.charAt(i);
            }else{
                break;
            }
        }
        return str;
    }
}