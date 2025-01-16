package trees;

public class PrintElementsOfNthlevel {
//Consider 0 based level
	public static void nthLevel(Node root, int level, int i) { //printing by preOrder
//will give same output for in and post as well
		if(root == null) return;
		if(i == level) {
			System.out.print(root.val + " ");
			return;
		}
		nthLevel(root.left, level, i + 1);
		nthLevel(root.right, level, i + 1);
	}
	public static void main(String[] args) {
		Node a = new Node(1); // a is a root node
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		e.left = h; f.right = i;
		
		for(int j = 0; j <= 3; j++) { //level order traversal by DFS
			nthLevel(a, j, 0);
			System.out.println();
		}
	}
}
