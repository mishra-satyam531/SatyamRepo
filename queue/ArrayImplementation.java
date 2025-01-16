package queue;

class Que{
	int r = -1, f, size;
	int[] arr;
	Que(int len){
		arr = new int[len];
	}
	void add(int val) throws Error {
		if(size == arr.length) throw new Error("STACK OVERFLOW!!");
		arr[r + 1] = val;
		r++;
		size++;
	}
	int remove() throws Error {
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		int val = arr[f++];
		size--;
		return val;
	}
	int peek() throws Error{
		if(size == 0) throw new Error("STACK UNDERFLOW!!");
		return arr[f];
	}
	boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	int size() {
		return size;
	}
	void disp() {
		if(size == 0) return;
		for(int i = f; i <= r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
public class ArrayImplementation {

	public static void main(String[] args) {
		Que que = new Que(7);
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