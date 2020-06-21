class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> minStk;
    /** initialize your data structure here. */
    public MinStack() {
        this.stk = new Stack<Integer>();
        this.minStk = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.stk.push(x);
        if(this.minStk.empty() || x <= this.minStk.peek()) {
            this.minStk.push(x);
        }
    }
    
    public void pop() {
        if(this.stk.peek().equals(this.minStk.peek())) {
            this.minStk.pop();
        }
        this.stk.pop();
    }
    
    public int top() {
        return this.stk.peek();
    }
    
    public int getMin() {
        return this.minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */