import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int maxDepth(String s) {
        Stack sc =new Stack();
        int ans=0;
        Deque<Character> stack = new ArrayDeque<>();
        int cnt=0;
        for(int i =0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                stack.push(a);
                cnt++;
            }
            else if(a==')'){
                stack.pop();
                cnt--;
            }
            ans=Math.max(cnt,ans);
        }
        return ans;
    }
}