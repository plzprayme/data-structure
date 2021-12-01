package tree;

import java.util.Objects;

public class MyBinaryTree {

	static class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public Node(int data, Node left, Node right, Node parent) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private final Node root;

	public MyBinaryTree(Node root) {
		this.root = root;
	}

	public void put(int value) {
		Node newNode = new Node(value);
		Node current = root;

		while (true) {
			if (value < current.data) {
				if (Objects.isNull(current.left)) {
					current.left = newNode;
					return;
				}
				current = current.left;
			} else if (value > current.data) {
				if (Objects.isNull(current.right)) {
					current.right = newNode;
					return;
				}
				current = current.right;
			} else {
				return;
			}
		}
	}

	public boolean contains(int value) {
		Node current = root;

		while (Objects.nonNull(current)) {
			if (value < current.data) {
				current = current.left;
			} else if (value > current.data) {
				current = current.right;
			} else {
				return true;
			}
		}

		return false;
	}

	public boolean remove(int value) {
		// value가 존재하지 않는 경우

		// value가 단말 노드인 경우

		// value가 루트인 경우

		// value가 중간 노드인 경우

		return false;
	}

}
