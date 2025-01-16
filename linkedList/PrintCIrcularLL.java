package linkedList;

public class PrintCIrcularLL {

	public static void print(Node head) {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.print(temp.val + " ");
	}
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = a;
		
		print(a);
	}

}