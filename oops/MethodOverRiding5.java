package oops;

class Parentss{
	void methodOne() { //default access modidfier
		System.out.println("Hello from Parent class");
	}
}
class Childss extends Parentss{
//	while overriding we can't reduce the scope of access modifier
//	private < default < protected < public
	protected void methodOne() {
		System.out.println("Hello from child class");
	}
}
class MethodOverRiding5{
	public static void main(String[] args) {
		Parentss p = new Childss();
		
		p.methodOne();
	}
}