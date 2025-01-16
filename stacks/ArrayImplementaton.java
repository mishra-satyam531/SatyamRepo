package stacks;

import java.util.Scanner;

class Stack{
	int[] arr;
	int idx;
	Stack(int size){ //constructor
		arr = new int[size];
	}
	
	void push(int x) throws Error{
		if(isFull()) throw new Error("STACK FULL!!");
		arr[idx] = x;
		idx++;
	}
	int peek() throws Error{
		if(isEmpty()) throw new Error("STACK IS EMPTY!!");
		return arr[idx - 1]; 
	}
	int pop() throws Error{
		if(isEmpty()) throw new Error("STACK IS EMPTY!!");
		int ele = arr[idx - 1];
		arr[idx - 1] = 0;
		idx--;
		return ele;
	}
	void disp() {
		int i = 0;
		while(i < idx) {
			System.out.print(arr[i] + " ");
			i++; 
		}
		System.out.println();
	}
	int size() {
		return idx;
	}
	boolean isEmpty() {
		if(idx == 0) return true;
		return false;
	}
	boolean isFull() {
		if(idx == arr.length) return true;
		return false;
	}
}
public class ArrayImplementaton {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of stack : ");
		int n;
		Stack st = new Stack(n = scan.nextInt());
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
		System.out.println(st.isFull());
		
	}

}
