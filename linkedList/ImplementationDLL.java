package linkedList;

class DLL{
	dNode head;
	dNode tail;
	int size;
	
	void disp() {
		dNode temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	void insertAtTail(int val){
		dNode temp = new dNode(val);
		if(head == null) {
			head = tail = temp;
		}else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
		size++;
	}
	public void insertAtHead(int val) {
		dNode temp = new dNode(val);
		if (head == null) head = tail = temp;
		else {
			head.prev = temp;
			temp.next = head;
			head = temp;
		}
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
		}
		if(idx > size || idx < 0) throw new Error("Valid nhi hai bro!!");
		dNode t = head;
		dNode temp = new dNode(val);
		for(int i = 1; i < idx; i++) {
			t = t.next;
		}
		temp.next = t.next;
		t.next.prev = temp;
		t.next = temp;
		temp.prev = t;
		size++;
	}
	void deleteHead() throws Error{
		if(head == null) throw new Error("Element hi nhi hai");
		head = head.next;
		head.prev = null;
		size--;
	}
	void deleteTail() throws Error {
		if(head == null) throw new Error("Element hi nhi hai");
		tail = tail.prev;
		tail.next = null;
		size--;
	}
	void delete(int idx) throws Error{
		if(idx == 0) {
			deleteHead();
			return;
		}
		if(idx == size - 1) {
			deleteTail();
			return;
		}
		if(idx >= size || idx < 0) throw new Error("Valid index daal!!");
		dNode temp = head;
		for(int i = 1; i < idx; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
		size--;
	}
	int get(int idx) throws Error {
		if(idx == 0) return head.val;
		if(idx == size - 1) return tail.val;
		if(idx >= size || idx < 0) throw new Error("Valid index daal!!");
		dNode temp = head;
		for(int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	void set(int idx, int val) {
		if(idx == 0) {
			head.val = val;
			return;
		}
		if(idx == size - 1) {
			tail.val = val;
			return;
		}
		if(idx >= size || idx < 0) throw new Error("Valid index daal!!");
		dNode temp = head;
		for(int i = 0; i < idx; i++) {
			temp= temp.next;
		}
		temp.val = val;
	}
}
public class ImplementationDLL {

	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertAtTail(40);
		list.insertAtTail(50);
		list.insertAtTail(60);
		list.disp();
		list.insertAtHead(20);
		list.insertAtHead(10);
		list.insert(2, 30);
		list.disp();
		System.out.println("Size is : " + list.size);
		list.deleteHead();
		list.deleteTail();
		list.disp();
		System.out.println("Size is : " + list.size);
		list.delete(2);
		list.disp();
		System.out.println("Size is : " + list.size);
		System.out.println(list.get(2));
		list.set(2, 40);
		list.disp();
		System.out.println("Size is : " + list.size);
	}
}