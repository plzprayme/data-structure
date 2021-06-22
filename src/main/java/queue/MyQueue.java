package queue;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 클래스로 Enqueue, Dequeue 구현하기
 * Dequeue에서 큐에 데이터가 없을 시, null 리턴
 * Generic사용하기
 */

public class MyQueue<T> {
    private final int FIRST = 0;

    private List<T> q = new ArrayList<>();

    public void enqueue(T item) {
        q.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        return q.remove(FIRST);
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    @Override
    public String toString() {
        int qSize = q.size();
        String[] items = new String[qSize];

        for (int i = 0; i < qSize; i++) {
            items[i] = q.get(i).toString();
        }

        return String.join(",", items);
    }
}
