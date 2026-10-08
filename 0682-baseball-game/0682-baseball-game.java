import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack st=new Stack();
        for(String s : operations){
            if(!s.equals("C") && !s.equals("+") && !s.equals("D")){
                int num = Integer.parseInt(s);
                st.push(num);
            }
            else if(s.equals("C") && st.size()!=0){
                st.pop();
            }
            else if(s.equals("D") && st.size()!=0){
                int c=(int)st.pop();
                st.push(c);
                st.push((2*c));
            }
            else if(s.equals("+") && st.size()!=0){
                int a=(int)st.pop();
                int b=(int)st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
        }
        int sum=0;
        while(st.size()!=0){
            sum+=(int)st.pop();
        }
        return sum;
    }
}