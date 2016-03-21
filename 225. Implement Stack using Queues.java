class MyStack {    
    
    Queue<Integer> queue = new LinkedList<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        queue.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = queue.size();
        for(int i = 0; i < size - 1; i++)
            queue.offer(queue.poll());
        queue.remove();
    }

    // Get the top element.
    public int top() {
        int size = queue.size();
        for(int i = 0; i < size - 1; i++)
            queue.offer(queue.poll());
        int top = queue.poll();
        queue.add(top);
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();        
    }
}