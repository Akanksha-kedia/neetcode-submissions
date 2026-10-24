


class MinStack {
    Stack<Integer> bucket = new Stack<>();
    Stack<Integer> st = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        bucket.push(val);

        // Push if this value is a new minimum or equal to it
        if (st.isEmpty() || val <= st.peek()) {
            st.push(val);
        }
    }

    public void pop() {
        int val = bucket.pop();

        // Remove from min stack if the popped value is the current minimum
        if (val == st.peek()) {
            st.pop();
        }
    }

    public int top() {
        return bucket.peek();
    }

    public int getMin() {
        return st.peek();
    }
}
