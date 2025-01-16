package linkedList;

class SinglyLL { //Singly Linked List, User Defined Data Structure
	Node head;
	Node tail;
	int sizeLL;
	
	public void insertAtEnd(int val){
		Node temp = new Node(val);
		if(head == null) {
			 head = tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		sizeLL++;
	}
	
	public void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
		}else {
			temp.next = head;
			head = temp;
		}
		sizeLL++;
	}
	
	public void insert(int idx, int val) {
		if(idx == 0)	 {
			insertAtHead(val);
			return;
		}
		if(idx == sizeLL) {
			insertAtEnd(val);
			return;
		}
		if(idx > sizeLL || idx < 0) {
			System.out.println("Invalid index");
			return;
		}
		Node temp = new Node(val);
		Node x = head;
		for(int i = 1; i <= idx - 1; i++) {
			x = x.next;
		}
		
//		insertion
		temp.next = x.next;
		x.next = temp;
		sizeLL++;
	}
	
	int get(int idx) throws Error {
		if(idx == sizeLL - 1) return tail.val;
		if(idx >= sizeLL || idx < 0) {
			throw new Error("Invalid Syntax");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	
	void update(int idx, int val) throws Error{
		if(idx == sizeLL - 1) {
			tail.val = val;
			return;	
		}
		if(idx >= sizeLL || idx < 0) {
			throw new Error("Invalid index");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		temp.val = val;
	}

	void deleteAtHead() throws Error {
		if(head == null) {
			throw new Error("List is Empty");
		}
		head = head.next;
		sizeLL--;
	}	
	
	void delete(int idx) throws Error {
		if(idx < 0 || idx >= sizeLL) {
			throw new Error("Invalid Index");
		}
		if(idx == 0){
            deleteAtHead();
            return;
        }
		Node temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}
		if(temp.next == tail) tail = temp;
		temp.next = temp.next.next;
		sizeLL--;
	}
	
	void disp() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void size() {
		System.out.println("Size is : " + sizeLL);
	}
}
public class Implementation{
	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.insertAtHead(60);
		list.insertAtHead(70);
		list.insert(2,25);
		list.insert(2,26);
		list.insert(3,34);
		list.insert(10,34); //last idx
		list.insert(0,99); //first idx
		list.insert(14,22); //invalid idx
		
		list.disp();
		list.size();
		System.out.println(list.get(2));
//		System.out.println(list.get(-1)); throws error
		list.update(1, 100);
		list.disp();
		list.size();
		list.deleteAtHead();
		list.delete(5);
		list.disp();
		list.size();
		
	}
}