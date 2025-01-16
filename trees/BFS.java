package trees;

import java.util.ArrayDeque;
import java.util.Queue;

class Pair{
	Node node;
	int level;
	Pair(Node node, int level){
		this.node = node;
		this.level = level;
	}
}

public class BFS {
//	BREADTH FIRST SEARCH, LEVEL ORDER TRAVERSAL
	public static void levelOrder(Node root) {
		Queue<Node> q = new ArrayDeque<>();
		if (root != null) q.add(root);
		while(q.size() > 0) {
			Node front = q.poll();
			System.out.print(front.val + " ");
			if(front.left != null) q.add(front.left);
			if(front.right != null) q.add(front.right);
		}
	}
	
	public static void levOrder(Node root) {
		Queue<Node> q = new ArrayDeque<>();
		if (root != null) q.add(root);
		while(q.size() > 0) {
			Node front = q.poll();
			System.out.print(front.val + " ");
			if(front.right != null) q.add(front.right);
			if(front.left != null) q.add(front.left);
		}
	}
	
	public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
	
	public static void bfs(Node root) {
		int prevlvl = 0;
		Queue<Pair> q = new ArrayDeque<>();
		if (root != null) q.add(new Pair(root, 0));
		while(q.size() > 0) {
			Pair front = q.poll();
			Node temp = front.node;
			int lvl = front.level;
			
			if(prevlvl != lvl) {
				System.out.println();
				prevlvl++;
			}
			System.out.print(temp.val + " ");
			
			if(temp.left != null) q.add(new Pair(temp.left, lvl + 1));
			if(temp.right != null) q.add(new Pair(temp.right, lvl + 1));
		}
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
		
		levelOrder(a); //left to right trversal
		System.out.println();
		levOrder(a); //right to left traversal
		System.out.println();
		
		int lvl = levels(a);
		bfs(a);
	}

}
