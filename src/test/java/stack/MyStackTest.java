package stack;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
    public void 삽입() {
        MyStack<Integer> stack = new MyStack();
        stack.push(5);
        assertEquals(stack.toString(), "5");
    }

    @Test
    public void 제거() {
        MyStack<Integer> stack = new MyStack();
        stack.push(5);
        stack.push(6);
        assertEquals(stack.pop(), 6);
    }

    @Test
    public void 제거2() {
        MyStack<Integer> stack = new MyStack();
        Integer actual = stack.pop();
        assertEquals(actual, null);
    }
}
