package trees;

public class NodeWithMaxValue {
	private static int maxNode(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(maxNode(root.left), maxNode(root.right)));
	}

	public static void main(String[] args) {
		Node a = new Node(1); // a is a root node
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(10);
		Node h = new Node(2);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		c.left = g; e.right = h;
		
		System.out.println(maxNode(a));
	}

}
