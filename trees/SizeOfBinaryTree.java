package trees;

public class SizeOfBinaryTree {
	public static int size(Node root) {
		if(root == null) return 0;
		int size = 1 + size(root.left) + size(root.right);
		return size;
		
	}

	public static void main(String[] args) {
		Node a = new Node(1); // a is a root node
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(0);
		Node h = new Node(2);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		c.left = g; e.right = h;
		
		System.out.println(size(a));
	}

}
