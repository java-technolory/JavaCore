package mta.edu.vn;

public class TreeExample {

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	//
	Node root = null;

	//
	boolean isEmpty() {
		return root == null;
	}

	//
	Node createNode(int data) {
		Node node = new Node(data);
		node.left = node.right = null;
		return node;
	}

	//
	Node findNode(int data) {
		Node x = null;
		Node p = root;
		if (isEmpty()) {
			return null;
		}
		Node q = p;

		while (p != null) {
			q = p;
			if (p.data > data) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return q;
	}

	//
	void insertNode(int x) {
		Node n = createNode(x);
		if (isEmpty()) {
			root = n;
			return;
		} else {
			Node f = findNode(x);
			if (f != null) {
				if (f.data > x) {
					f.left = n;
				} else {
					f.right = n;
				}
			}
		}
	}

	//
	void createTree(int a[]) {
		for (int i : a) {
			insertNode(i);
		}
	}

	//
	Node q;

	Node searchRecursion(Node p, int x) {
		if (p == null) {
			return null;
		}
		if (p.data == x) {
			return p;
		}
		if (p.data > x) {
			return q = searchRecursion(p.left, x);
		} else {
			return q = searchRecursion(p.right, x);
		}
	}

	//
	Node searchLoop(int x) {
		Node p = root;
		while (p != null) {
			if (p.data == x) {
				return p;
			} else if (p.data > x) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return null;
	}

	//
	void NLR(Node p) {
		if (p != null) {
			System.out.print(p.data + " ");
			NLR(p.left);
			NLR(p.right);
		}
	}

	//
	void LNR(Node p) {
		if (p != null) {
			LNR(p.left);
			System.out.print(p.data + " ");
			LNR(p.right);
		}
	}

	//
	void LRN(Node p) {
		if (p != null) {
			LRN(p.left);
			LRN(p.right);
			System.out.print(p.data + " ");
		}
	}

	public static void main(String[] args) {
		TreeExample tree = new TreeExample();

		int a[] = { 40, 5, 35, 45, 15, 56, 48, 13, 16, 49, 47 };

		tree.createTree(a);

		//
		TreeExample.Node node = tree.searchRecursion(tree.root, 13);
		TreeExample.Node node2 = tree.searchLoop(13);
		System.out.println(node2);
		if (node != null) {
			System.out.println("Result = " + node.data);
		} else {
			System.out.println("Not found!");
		}
		tree.NLR(tree.root);
		System.out.println();
		tree.LNR(tree.root);
		System.out.println();
		tree.LRN(tree.root);
		System.out.println("");
	}

}
