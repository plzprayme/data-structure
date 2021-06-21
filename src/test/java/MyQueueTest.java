import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import queue.MyQueue;

public class MyQueueTest {

    @Test
    public void 큐에_아이템을_추가할_수_있다() {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(1);
        q.enqueue(2);

        assertEquals("1,2", q.toString());
    }

    @Test
    public void 큐의_아이템을_제거할_수_있다() {
        MyQueue<Integer> q = new MyQueue<>();
        Integer expected = 1;
        q.enqueue(expected);
        Integer actual = q.dequeue();

        assertEquals(expected, actual);
    }

    @Test
    public void 제거할_아이템이_없을_때_NULL을_반환한다() {
        MyQueue<Integer> q = new MyQueue<>();
        Integer actual = q.dequeue();

        assertEquals(null, actual);
    }

}
