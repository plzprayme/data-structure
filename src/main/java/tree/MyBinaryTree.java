package tree;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

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
		// 지금 노드에서 다음 노드를 결정할 것인가? YES

		// 루트를 삭제하는 경우
		 // 왼쪽 서브 트리의 가장 오른쪽 값을 가져오기
		 // 오른쪽 서브 트리의 가장 왼족 값을 가져오기

		// 중간 노드를 삭제하는 경우
		 // 왼쪽 노드만 존재할 경우
		 // 오른쪽 노드만 존재할 경우
		 // 왼쪽과 오른쪽 모두 존재할 경우

		// 단말 노드를 삭제하는 경우


		if (value == root.data) {
			//
		}

		Node current = root;
		while (Objects.nonNull(current)) {
			if (Objects.nonNull(current.left) && value == current.left.data) {
				// 왼쪽 노드 삭제
				Node tempLeft = current.left.left;
				Node tempRight = current.left.right;

				if (Objects.isNull(tempLeft) && Objects.isNull(tempRight)) {
					current.left = null;
					return true;
				} else if (Objects.isNull(tempLeft)) {
					current.left = current.left.right;
				} else if (Objects.isNull(tempRight)) {
					current.left = current.left.left;
				} else {
					tempLeft.right = current.left.right;
					current.left = current.left.left;
					return true;
				}

			} else if (Objects.nonNull(current.right) && value == current.right.data) {
				// 오른쪽 노드를 삭제해야 함
				Node tempLeft = current.right.left;
				Node tempRight = current.right.right;

				if (Objects.isNull(tempLeft) && Objects.isNull(tempRight)) {
					current.right = null;
					return true;
				} else if (Objects.isNull(tempLeft)) {
					current.right = tempRight;
				} else if (Objects.isNull(tempRight)) {
					current.right = tempLeft;
				} else {
					tempLeft.right = tempRight;
					current.left = tempLeft;
					return true;
				}

			} else {
				if (value < current.data) {
					current = current.left;
				} else if (value > current.data) {
					current = current.right;
				}
			}

		}

		return false;
	}

}
