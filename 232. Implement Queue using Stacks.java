class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stk_in = new Stack<Integer>();
    Stack<Integer> stk_out = new Stack<Integer>();
    
    public void push(int x) {
        stk_in.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stk_out.empty()) {
            while (!stk_in.empty()) {
                stk_out.push(stk_in.pop());
            }
        }
        stk_out.pop();
    }

    // Get the front element.
    public int peek() {
        if (stk_out.empty()) {
            while (!stk_in.empty()) {
                stk_out.push(stk_in.pop());
            }
        }
        return stk_out.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stk_in.empty() && stk_out.empty();
    }
}