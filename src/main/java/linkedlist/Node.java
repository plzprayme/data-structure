package linkedlist;

public class Node<T> {
    T data;
    public Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    public boolean sameWith(T data) {
        return data == this.data;
    }

    public boolean nextIsNull() {
        return next == null;
    }

    public void link(Node<T> next) {
        this.next = next;
    }

    public void print() {
        System.out.println(data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
