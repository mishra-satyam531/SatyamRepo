package trees;

public class SumOfTreeNodes {
	private static int sumOfNodes(Node root, int sum) {
		if(root == null) return 0; //base case
		sum = root.val + sumOfNodes(root.left, sum) + sumOfNodes(root.right, sum);
		return sum;
	}

	public static void main(String[] args) {
		Node a = new Node(1); // a is a root node
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(10);
		Node h = new Node(20);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		c.left = g; e.right = h;
		
		System.out.println(sumOfNodes(a, 0));
	}

}
