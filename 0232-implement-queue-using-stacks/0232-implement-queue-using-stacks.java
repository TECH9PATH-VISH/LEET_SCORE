import java.util.Stack;
class MyQueue {
    Stack st=new Stack();
    Stack rt=new Stack();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
        return;
    }
    
    public int pop() {
        while(st.size()>1){
            rt.push(st.pop());
        }
        int top=(int)st.pop();
        while(rt.size()>=1){
            st.push(rt.pop());
        }
        return top;
    }
    
    public int peek() {
        while(st.size()>1){
            rt.push(st.pop());
        }
        int top=(int)st.peek();
        while(rt.size()>=1){
            st.push(rt.pop());
        }
        return top;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */