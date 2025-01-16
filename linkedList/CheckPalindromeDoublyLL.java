package linkedList;

public class CheckPalindromeDoublyLL {
	public static boolean palindrome(dNode a, dNode d) {
		dNode temp1 = a, temp2 = d;
		while(temp1 != temp2 && temp1.prev != temp2) {
			if(temp1.val != temp2.val) return false;
			temp1 = temp1.next;
			temp2 = temp2.prev;
		}
		return true;
	}

	public static void main(String[] args) {
		dNode a = new dNode(10);
		dNode b = new dNode(20);
		dNode c = new dNode(20);
		dNode d = new dNode(10);
		
		a.next = b; b.prev = a;
		b.next = c; c.prev = b;
		c.next = d; d.prev = c;
//		d.next = e; e.prev = d;
		
		System.out.println(palindrome(a, d));
	}

}
