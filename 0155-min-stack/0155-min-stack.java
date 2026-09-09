class MinStack {
    Stack<Integer>s;
    Stack<Integer>n;
    public MinStack() {
        s=new Stack<>();
        n=new Stack<>();
    }
    public void push(int val) {
        s.push(val);
        if(n.isEmpty() || n.peek()>=val)
            n.push(val);
    }
    public void pop() {
        if(s.peek().equals(n.peek())){
            n.pop();
        }
        s.pop();
    }
    public int top() {
       return  s.peek();
    }
    public int getMin() {
       return  n.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */