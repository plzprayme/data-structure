package linkedlist;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    private class Node<T> {
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


    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        getLastNode().link(newNode);
    }

    public void printAll() {
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }

        Node<T> node = head;
        node.print();
        while (!node.nextIsNull()) {
            node = node.next;
            node.print();
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> node = head;
        if (!search(isData)) {
            getLastNode().link(new Node<>(data));
            return;
        }

        while (!node.nextIsNull()) {
            if (!node.sameWith(isData)) {
                node = node.next;
                continue;
            }

            Node<T> newNode = new Node<>(data);
            newNode.link(head.next);
            head.link(newNode);
            return;
        }
    }

    private boolean search(T isData) {
        Node<T> node = head;
        while (!node.nextIsNull()) {
            if (node.sameWith(isData)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    private Node<T> getLastNode() {
        Node<T> node = head;
        while(!node.nextIsNull()) {
            node = node.next;
        }
        return node;
    }

    public void deleteNode(T isData) {
        if (head.sameWith(isData)) {
            head = head.next;
            return;
        }

        Node<T> node = head;
        while (node.next != null) {
            if (node.next.sameWith(isData)) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
    }
}
