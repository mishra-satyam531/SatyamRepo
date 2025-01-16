package oops;

class Parents{
	public Object methodOne() {
		return null;
	}
}
//class Children extends Parents{
//	public void methodOne() {
//		System.out.println("Hello from child");
//	}
//}
// IN CASE OF OVERRIDING, WE CAN'T CHANGE THE RETURN TYPE OF THE METHOD, IF WE WANT
// TO CHANGE THEN THERE SHOULD BE RELATIONSHIP BETWEEN RETURN TYPE OF THE METHODS.
class Children extends Parents{
	public String methodOne() {
		System.out.println("Hello from child");
		return null;
	}
}
class MethodOverRiding4{
	public static void main(String[] args) {
		Parents p = new Children();
		
		p.methodOne();
	}
}