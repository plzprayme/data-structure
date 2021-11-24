package queue;

public interface MyQueue<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
}
