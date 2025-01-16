package trees;

public class PreInPost {
	public static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
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
		
		preOrder(a);
		System.out.println();
		inOrder(a);
		System.out.println();
		postOrder(a);
	}

}
