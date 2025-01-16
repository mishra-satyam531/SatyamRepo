package oops;

class Paren{
	public final void methodOne() {
		System.out.println("Parent class : methodOne()");
	}
}
//class Chil extends Paren{
////	final methods can't be overridden in child class
//	public void methodOne() {
//		System.out.println("Child class : methodOne()");
//	}
//}
//class MethodOverRiding6{
//	public static void main(String[] args) {
//		Paren c = new Chil();
//		
//		c.methodOne();
//	}
//}