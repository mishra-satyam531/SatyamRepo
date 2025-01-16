package oops;

interface ICalcs{
	public abstract void add(int a, int b); //public abstract is obvious no need to write
	void sub(int a, int b);
}
class IAdvCalcs{
	public void mul(int a, int b) {
		System.out.println("Div is : " + (a * b));
	}
	public void div(int a, int b) {
		System.out.println("Prod is : " + (a / b));
	}
}
// A class can extends a class and can implement any no of interfaces simultaneously
//inheritance
//implementation
class CalcsImp1 extends IAdvCalcs implements ICalcs{
	public void add(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}
	public void sub(int a, int b) {
		System.out.println("Diff is : " + (a - b));
	}
}
public class Interface6{
	public static void main(String[] args) {
		CalcsImp1 c = new CalcsImp1();
		
		c.add(10, 20);
		c.sub(100, 20);
		c.mul(20, 10);
		c.div(100, 20);
	}
}