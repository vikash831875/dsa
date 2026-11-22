class Solution {
    public boolean checkString(String s) {
        
        int count = 0; 
        for(int i =0 ; i<s.length();i++){
            char ch =s.charAt(i);
            if(ch == 'a'){
                count++;
            }


        }
        for(int i = count ; i<s.length();i++){
           char ch = s.charAt(i);
            if(ch == 'a'){
                return false;
                
            }
        }
        return true;
    }
}