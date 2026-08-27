class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for(int i =1 ; i<s.length(); i++){
            if(!st.empty()&&st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
                
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.empty()){
            result.append(st.pop());
        }

        return result.reverse().toString();
        
    }
}