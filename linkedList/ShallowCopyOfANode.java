package linkedList;

public class ShallowCopyOfANode {
	public static void main(String[] args) {
		Node a = new Node(100);
		System.out.println(a.val);
		Node temp = a; //shallow copy
//		Node temp = new Node(a); //deep copy
		temp.val = 10;
		System.out.println(a.val);
		System.out.println(temp.val);
	}
}

