package oops;

abstract class Parentt{
	public abstract void methodOne();
}
// In case of over riding, compulsorily the child class should give implementation
// for all the abstract methods present in the parent class, if the implementation
// is not given then that child class should be marked as "abstract".
class Childd extends Parentt{
	public void methodOne() {
		System.out.println("Child class : MethodOne");
	}
}
public class MethodOverRiding7{
	public static void main(String[] args) {
		Parentt p = new Childd();
		p.methodOne();
	}
}