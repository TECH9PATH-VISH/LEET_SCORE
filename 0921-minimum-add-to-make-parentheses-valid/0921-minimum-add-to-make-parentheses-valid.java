import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if (a == ')' && !st.isEmpty() && (char)st.peek() == '(') {
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        return st.size();
        
    }
}