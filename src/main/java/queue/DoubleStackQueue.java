package queue;

import java.util.Stack;

public class DoubleStackQueue<T> implements MyQueue<T> {

    private Stack<T> input = new Stack<>();
    private Stack<T> output = new Stack<>();

    @Override
    public void enqueue(T item) {
        input.add(item);
    }

    @Override
    public T dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.add(input.pop());
            }
        }

        return output.pop();
    }

    @Override
    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
