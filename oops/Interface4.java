package oops;

interface ICalcMachines{
	void add(int a, int b);
	void sub(int a, int b);
	void mul(int a, int b);
	void div(int a, int b);
}
class CalcMachinesImp implements ICalcMachines{
	public void add(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}
	public void sub(int a, int b) {
		System.out.println("Diff is : " + (a - b));
	}
	public void mul(int a, int b) {
		System.out.println("Prod is : " + (a * b));
	}
	public void div(int a, int c) {
		System.out.println("Div is : " + (a / c));
	}
}
public class Interface4{
	public static void main(String[] args) {
//		loose coupling : polymorphism
		ICalcMachines c = new CalcMachinesImp();
		
		c.add(10, 20);
		c.add(100, 20);
		c.sub(100, 20);
		c.mul(10, 20);
		c.div(100, 20);
	}
}