package Set;

import java.util.TreeMap;

// HashSet은 HashMap으로 구현되어 있다.
public class MyHashSet<E> implements MySet<E> {

    Node<E>[] node;

    private MyHashSet(int size) {
        node = new Node[size];
    }

    public MyHashSet() {
        this(16);
    }

    @Override
    public void add(E key) {
        final int hash = key.hashCode() % 16;
        node[hash] = new Node<>(hash, key);
    }

    private static class Node<E> {
        final int hash;
        final E key;
        Node<E> next;

        private Node(int hash, E key, Node<E> next) {
            this.hash = hash;
            this.key = key;
            this.next = next;
        }

        private Node(int hash, E key) {
            this(hash, key, null);
        }

    }
}
