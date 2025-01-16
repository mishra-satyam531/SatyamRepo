package heaps;

class MaxHeap{
	private int[] arr;
	private int size;
	MaxHeap(int capacity){
		arr = new int[capacity];
	}
	
	void add(int val) throws Error{
		if(size == arr.length) throw new Error("HEAP IS FULL!!");
		arr[size++] = val;
		upheapify(size - 1);
	}

	private void upheapify(int i) {
		int parent = (i - 1)/2;
		if(arr[parent] < arr[i]) {
			swap(i, parent);
			upheapify(parent);
		}
	}
	
	int getSize() {
		return size;
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	int peek() throws Error {
		if(size == 0) throw new Error("HEAP IS EMPTY!!");
		return arr[0];
	}
	
	int remove() throws Error {
		if(size == 0) throw new Error("HEAP IS EMPTY!!");
		int peek = arr[0];
		swap(0, size - 1);
		size--;
		downheapify(0);
		return peek;
	}

	private void downheapify(int i) {
		if(i >= size) return;
		int lc = 2 * i + 1, rc = 2 * i + 2; //left and right child
		int maxdx = i;
		if(lc < size && arr[lc] > arr[maxdx]) maxdx = lc;
		if(rc < size && arr[rc] > arr[maxdx]) maxdx = rc;
		if(i == maxdx) return;
		swap(maxdx, i);
		downheapify(maxdx);
	}
}

public class MaxHeapImplementation {

	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10);
		System.out.println("Size is : " + heap.getSize());
		heap.add(5);
		heap.add(0);
		heap.add(18);
		heap.add(9);
		System.out.println("Removed element : " + heap.remove());
		System.out.println("Peek : " + heap.peek());
		System.out.println("Size is : " + heap.getSize());
	}
}