import java.util.Stack;
class MinStack {
    Stack st=new Stack();
    Stack rt=new Stack();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(rt.size()==0 || value<=(int)rt.peek()){
            rt.push(value);
        }
        
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        int rem = (int)st.pop();
        if (rem == (int)rt.peek()) {
            rt.pop();
        }
    }
    
    public int top() {
        return (int)st.peek();
    }
    
    public int getMin() {
        int min=(int)rt.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */