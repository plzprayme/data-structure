package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void 노드_연결(){
        Node<Integer> node = new Node<>(1);
        node.next = new Node<>(2);
        assertEquals(node.next.toString(), "2");
    }
}
