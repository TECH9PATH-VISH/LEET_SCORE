import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1){
            return s;
        }
        Stack<Character> st=new Stack<>();
        Stack<Character> rt=new Stack<>();
        String ans="";
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char a=s.charAt(i);
            if(st.size()==0){
                st.push(a);
            }
            else if(st.peek()==a){
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            ans+=rt.pop();
        }
        return ans;

        
    }
}