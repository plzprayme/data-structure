package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DoubleStackQueueTest {
    @Test
    public void 정수형_데이터_한개를_삽입할_수_있다() {
        // given
        MyQueue<Integer> q = new DoubleStackQueue<>();

        // when
        q.enqueue(5);

        // then
        assertEquals(5, q.dequeue());
    }

    @Test
    public void 데이터는_선입선출이다() {
        // given
        MyQueue<Integer> q = new DoubleStackQueue<>();

        // when
        for (int i : new int[]{1, 2, 3, 4, 5}) {
            q.enqueue(i);
        }

        // then
        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
        assertEquals(3, q.dequeue());
        assertEquals(4, q.dequeue());
        assertEquals(5, q.dequeue());
    }

    @Test
    public void 문자열_아이템을_삽입할_수_있다() {
        // given
        MyQueue<String> q = new DoubleStackQueue<>();

        // when
        q.enqueue("다섯");

        // then
        assertEquals("다섯", q.dequeue());
    }

    @Test
    public void 비어_있는지_확인할_수_있다() {
        // given // when // then
        assertTrue(new DoubleStackQueue<>().isEmpty());
    }
}
