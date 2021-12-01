package tree;

import static org.junit.jupiter.api.Assertions.*;
import static tree.MyBinaryTree.Node;

import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {

	@Test
	void 원소를_추가할_수_있다() {
		// given
		MyBinaryTree tree = new MyBinaryTree(new Node(10));

		// when
		tree.put(5);
		tree.put(4);
		tree.put(6);

		tree.put(15);
		tree.put(11);
		tree.put(16);

		// then
		System.out.println();
	}

	@Test
	void 원소를_검색할_수_있다() {
		// given
		MyBinaryTree tree = new MyBinaryTree(new Node(10));

		// when
		tree.put(5);
		tree.put(4);
		tree.put(6);

		tree.put(15);
		tree.put(11);
		tree.put(16);

		// then

		assertTrue(tree.contains(5));
		assertTrue(tree.contains(4));
		assertTrue(tree.contains(6));
		assertTrue(tree.contains(15));
		assertTrue(tree.contains(11));
		assertTrue(tree.contains(16));
		assertFalse(tree.contains(17));
	}

}