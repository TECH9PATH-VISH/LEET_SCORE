import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = new ArrayDeque<>();
        int n = 0;
        Deque<Character> stack2 = new ArrayDeque<>();
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                    n--;
                }
            } else {
                stack1.push(a);
                n++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            if (a == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                    m--;
                }
            }
            else{
                stack2.push(a);
                m++;
            }
        }
        if (m != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return true;

    }
}