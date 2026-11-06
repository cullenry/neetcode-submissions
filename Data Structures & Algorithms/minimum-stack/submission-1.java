class MinStack {
    public Stack<Integer> myStack;
    public Stack<Integer> minStack;


    public MinStack() {
        myStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        myStack.push(val);
        if (minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        }
        else {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        myStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
