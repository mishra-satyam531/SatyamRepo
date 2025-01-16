package oops;

interface ICalc{
	void add(int a, int b);
	void sub(int a, int b);
}
interface IAdvCalc{
	void mul(int a, int b);
	void div(int a, int b);
}
//A class can extends only from one class at a time.
//A class can implements any no of interfaces at a time.
class CalcImp1 implements ICalc, IAdvCalc{
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
class Interface5{
	public static void main(String[] args) {
		ICalc c = new CalcImp1();
		IAdvCalc ac = new CalcImp1();
		
		c.add(10, 20);
		c.add(100, 20);
		c.sub(100, 20);
		ac.mul(10, 20);
		ac.div(100, 20);
	}
}
