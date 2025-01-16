package queue;


class CD{
	int rear = -1, front, size;
	int[] arr = new int[5];
	
	public void add(int val) throws Error {
		if(size == arr.length) throw new Error("STACK OVERFLOW!!");
		if(rear == arr.length - 1) { // rear pointing to the last element
			arr[0] = val;
			rear = 0;
		}else arr[++rear] = val; //normal case
		size++;
	}
	int remove() throws Error {
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		int val = arr[front];
		if(front == arr.length - 1) front = 0;
		else front++;
		size--;
		return val;
	}
	int peek() throws Error{
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		return arr[front];
	}
	void disp() {
		if(size == 0) return;
		if(front <= rear) {
			for(int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}else {
			for(int i = front; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			for(int i = 0; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	int size() {
		return size;
	}
}

public class CircularDeque {

	public static void main(String[] args) {
		CD que = new CD();
		System.out.println(que.isEmpty());
		que.disp();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.disp();
		System.out.println(que.remove());
		que.add(50);
		que.add(60);
		que.disp();
//		que.add(70);
		que.remove();
		que.add(70);
		que.disp();	
		System.out.println("Size is : " + que.size());
		System.out.println(que.isEmpty());
	}
}