package queue;

class Node{
	Node next;
	int val;
	Node(int val){
		this.val = val;
	}
}

class Queue{
	Node head, tail;
	int size;
	void add(int val) {
		Node temp = new Node(val);
		if(size == 0) {
			head = tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	int peek() throws Error {
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		return head.val;	
	}
	int remove() throws Error {
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		int value = head.val;
		head = head.next;
		size--;
		return value;
	}
	boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	int size() {
		return size;
	}
	void disp() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class LinkedListImplementaion {

	public static void main(String[] args) {
		Queue que = new Queue();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		que.add(60);
		que.add(70);
		que.disp();
		que.remove();
		System.out.println(que.remove());
		que.disp();
		System.out.println(que.peek());
		System.out.println(que.isEmpty());
		System.out.println("Size of queue is : " + que.size());
	}

}
