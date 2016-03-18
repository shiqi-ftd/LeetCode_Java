class MinStack {
    Stack<Integer> stk = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        stk.push(x);
        if (min.empty()) {
            min.push(x);
        } else {
            int cur = min.peek();
            min.push(Math.min(x, cur));
        }
    }

    public void pop() {
        stk.pop();
        min.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
