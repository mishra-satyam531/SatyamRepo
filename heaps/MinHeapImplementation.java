package heaps;

class MinHeap{
	private int[] arr;
	private int size;
	MinHeap(int capacity){
		arr = new int[capacity];
	}
	
	void add(int val) throws Error{
		if(size == arr.length) throw new Error("HEAP IS FULL!!");
		
		arr[size++] = val;
		upheapify(size - 1);
	}

	private void upheapify(int idx) {
		int parent = (idx - 1) / 2;
		if(arr[idx] < arr[parent]) {
			swap(parent, idx);
			upheapify(parent);
		}
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];  
		arr[j] = temp;
	}
	
	int getSize() {
		return size;
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
		if(i >= size - 1) return;
		int lc = 2 * i + 1, rc = 2 * i + 2; //left and right child
		int mindx = i;
		if(lc < size && arr[lc] < arr[mindx]) mindx = lc;
		if(rc < size && arr[rc] < arr[mindx]) mindx = rc;
		if(i == mindx) return;
		swap(i, mindx);
		downheapify(mindx);
	}
}

public class MinHeapImplementation {

	public static void main(String[] args) {
		MinHeap heap = new MinHeap(10);
		System.out.println("Size is : " + heap.getSize());
		heap.add(10);
		heap.add(5);
		System.out.println("Removed element is : " + heap.remove());
		heap.add(0);
		System.out.println("Peek : " + heap.peek());
		heap.add(8);
		System.out.println("Size is : " + heap.getSize());
	}

}
