package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> stack = new ArrayList<>();

    public MyStack() {
    }

    public MyStack(List<T> stack) {
        this.stack = stack;
    }

    public void push(T e) {
        stack.add(e);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        int stackSize = stack.size();
        String[] items = new String[stackSize];

        for (int i = 0; i < stackSize; i++) {
            items[i] = stack.get(i).toString();
        }

        return String.join(",", items);
    }
}
