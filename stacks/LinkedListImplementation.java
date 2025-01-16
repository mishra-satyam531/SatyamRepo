package stacks;

class Node{
	int val;
	Node next;
	Node(int value){ //constructor
		this.val = value;
	} 
}

class Stacks{ 
	Node head;
	int size;
	
	void push(int val) {
		Node temp = new Node(val);
		temp.next = head;
		head = temp;
		size++;
	}
	int size() {
		return size;
	}
	int pop() throws Error{
		if(head == null) throw new Error("STACK IS EMPTY!!");
		int x = head.val;
		head = head.next;
		size--;
		return x;
	}
	int peek() throws Error{
		if(head == null) throw new Error("STACK IS EMPTY!!");
		return head.val;
	}
	boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	void disp() {
		dispRecursive(head);
		System.out.println();
	}
	void dispRecursive(Node head) {
		if(head == null) return;
		dispRecursive(head.next);
		System.out.print(head.val + " ");
	}
}
public class LinkedListImplementation {

	public static void main(String[] args) {
		Stacks st = new Stacks();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.disp();
		System.out.println("Last element is : " + st.peek());
		System.out.println("Size is : " + st.size());
		st.pop();
		System.out.println("Removed element is : " + st.pop());
		st.disp();
		System.out.println("Size is : " + st.size());
		System.out.println(st.isEmpty());
	}

}
