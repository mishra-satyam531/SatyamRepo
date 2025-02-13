package trees;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
	}
}

public class NodeOfTree {
	
	public static void display(Node root) {
		if(root == null) return; //base case
		System.out.print(root.val + " "); //self
		display(root.left); //left subtree
		display(root.right); //right subtree
	}

	public static void main(String[] args) {
		Node a = new Node(1); // a is a root node
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		
		Node g = new Node(10);
		Node h = new Node(20);
		c.left = g; e.right = h;
		
		display(a);
	}

}
