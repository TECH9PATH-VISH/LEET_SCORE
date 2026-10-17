import java.util.Stack;
class CustomStack {
    int maxSize;
    Stack<Integer> st= new Stack<>();
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(st.size()>=maxSize){
            return;
        }
        st.push(x);
    }
    
    public int pop() {
        if(st.size()<=0){
            return -1;
        }
        return (int)st.pop();
    }
    
    public void increment(int k, int val) {
        Stack sd=new Stack();
        while(st.size()!=0){
            sd.push(st.pop());
        }
        while(sd.size()!=0){
            int a=(int)sd.pop();
            if(k>0){
            a+=val;
            k--;
            }
            st.push(a);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */