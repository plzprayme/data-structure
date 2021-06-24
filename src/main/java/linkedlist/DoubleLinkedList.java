package linkedlist;

public class DoubleLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void append(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            return;
        }

        Node<T> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(data);
        node.next.prev = node;

    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
}
