import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='(' || a=='[' || a=='{'){
                st.push(a);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='(' && a==')'){
                    st.pop();
                }
                else if(st.peek()=='[' && a==']'){
                    st.pop();
                }
                else if(st.peek()=='{' && a=='}'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        
            return false;
        
    }
}