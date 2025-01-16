package linkedList;
class CyclicSLL{
	Node head;
	Node tail;
	int size;
	
	void disp() {
		if(head == null) {
			System.out.println();
			return;
		}
		Node temp = head;
		do {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		while (temp != head);
		System.out.println();
	}
	void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
			head.next = head;
			size++;
			return;
		}
		temp.next = head;
		tail.next = temp;
		head = temp;
		size++;
	}
	void insertAtTail(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
			head.next = head;
			size++;
			return;
		}
		tail.next = temp;
		temp.next = head;
		tail = temp;
		size++;
	}
	void insert(int idx, int val) throws Error {
		if(idx == 0) {
			insertAtHead(val);
			return;
		}
		if(idx == size) {
			insertAtTail(val);
			return;
		}if(idx < 0 || idx > size) throw new Error("NOT VALID!!");
		Node temp = new Node(val);
		Node t = head;
		for(int i = 1; i < idx; i++) {
			t = t.next;;;;;
		}
		temp.next = t.next;
		t.next = temp;
		size++;
		
	}
	void deleteAtHead() throws Error{
		if(head == null) throw new Error("List is Empty");
		if(head.next == head) {
			head = null;
			size--;
			return;
		}
		tail.next = head.next;
		head = head.next;
		size--;
	}
	void delete(int idx) throws Error{
		if(idx == 0) {
			deleteAtHead();
			return;
		}
		if(idx < 0 || idx > size) throw new Error("NOT VALID!!");
		Node temp = head;
		for(int i = 1; i < idx; i++) {
			temp = temp.next;
		}
		if(idx == size - 1) tail = temp;
		temp.next = temp.next.next;
		size--;
	}
}
public class ImplementationCyclicSLL {

	public static void main(String[] args) {
		CyclicSLL c = new CyclicSLL();
		c.insertAtHead(40);
		c.insertAtHead(30);
		c.insertAtHead(20);
		c.insertAtHead(10);
		c.insertAtTail(50);
		c.insertAtTail(60);
		c.insertAtTail(70);
		c.insert(3, 35);
		c.disp();
		c.deleteAtHead();
		c.disp();
		c.delete(2);
		c.disp();
		System.out.println(c.tail.val);
		System.out.print("Size is : " + c.size);
	}

}
