package queue;

class dNode{
	int val;
	dNode next, prev;
	dNode(int val){
		this.val = val;
	}
}

class Dequ{
	dNode rear, front;
	int size;
	
	boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	int size() {
		return size;
	}
	void insertAtFront(int val) {
		dNode temp = new dNode(val);
		if(front == null) {
			front = rear = temp;
		}else {
			temp.next = front;
			front.prev = temp;
			front = temp;
		}
		size++;
	}
	void insertAtRear(int val) {
		dNode temp = new dNode(val);
		if(front == null) {
			front = rear = temp;
		}else {
			rear.next = temp;
			temp.prev = rear;
			rear = temp;
		}
		size++;
	}
	void deleteFromFront() throws Error {
		if(front == null) throw new Error("STACK UNUNDERFLOW!!");
		else if(front.next == null) front = rear = null;//! element
		else {
			front = front.next;
			front.prev = null;
		}
		size--;
	}
	void deleteFromRear() throws Error {
		if(front == null) throw new Error("STACK UNUNDERFLOW!!");
		else if(front.next == null) front = rear = null; //1 element
		else {
			rear = rear.prev;
			rear.next = null;
		}
		size--;
	}
	int getFront() throws Error {
		if(front == null) throw new Error("STACK UNUNDERFLOW!!");
		return front.val;
	}
	int getRear() throws Error {
		if(front == null) throw new Error("STACK UNUNDERFLOW!!");
		return rear.val;
	}
}

public class Deque {

	public static void main(String[] args) {
		Dequ dq = new Dequ();
		dq.insertAtRear(5);
		dq.insertAtRear(10);
		System.out.println(dq.getRear());
		dq.deleteFromRear();
		System.out.println(dq.getRear());
		dq.insertAtFront(15);
		System.out.println(dq.getFront());
		System.out.println("Size is : " + dq.size());
		dq.deleteFromFront();
		System.out.println(dq.getFront());
		System.out.println(dq.isEmpty());
	}

}
