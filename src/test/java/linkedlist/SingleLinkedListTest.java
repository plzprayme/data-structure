package linkedlist;

import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {
    @Test
    public void 삽입() {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.printAll();
    }

    @Test
    public void 지정_삽입() {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.addNodeInside(5,1);
        sll.printAll();
    }

    @Test
    public void 지정_삽입_찾는_데이터가_없으면_맨_뒤에() {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.addNodeInside(5,3);
        sll.printAll();
    }

    @Test
    public void 출력() {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.printAll();
    }

    @Test
    public void 제거() {
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.deleteNode(1);
        sll.printAll();
    }
}
