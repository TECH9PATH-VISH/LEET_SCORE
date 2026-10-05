import java.util.Stack;

class Solution {
    public int minOperations(String[] logs) {
        Stack st = new Stack();
        for (int i = 0; i < logs.length; i++) {
            String s = logs[i];
            if (!s.equals("../") && !s.equals("./")) {
                st.push(s);
            }
            else if (s.equals("./")) {
                continue;
            }
            else if (s.equals("../")) {
                if (st.size() == 0) {
                    continue;
                }
                st.pop();
            }
        }
        return st.size();
    }
}