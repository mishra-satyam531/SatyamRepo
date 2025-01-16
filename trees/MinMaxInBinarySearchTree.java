package trees;

public class MinMaxInBinarySearchTree {
	public static int max(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		if(root.right == null) return root.val;
		return max(root.right);
	}

	public static int min(Node root) {
		if(root == null) return Integer.MAX_VALUE;
		if(root.left == null) return root.val;
		return min(root.left);
	}
	
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(5);
		Node c = new Node(15);
		Node d = new Node(2);
		Node e = new Node(8);
		Node f = new Node(12);
		Node g = new Node(19);
		Node h = new Node(13);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		f.right = h;
		
		System.out.println("Min value is : " + min(a));
		System.out.println("Max value is : " + max(a));
	}
}