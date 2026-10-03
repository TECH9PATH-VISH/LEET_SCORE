import java.util.Stack;
class Solution {
    public String clearDigits(String s) {
        Stack st =new Stack();
        Stack rt =new Stack();

        String ans="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'){
                if(st.size()==0){
                    continue;
                }
                else{
                    st.pop();
                }

            }else{
                st.push(a);
            }
        }
        if(st.size()==0){
            return ans;
        }
        while(st.size()!=0){
            rt.push(st.pop());
        }
        while(rt.size()!=0){
            ans+=rt.pop();
        }
        return ans;
        
    }
}