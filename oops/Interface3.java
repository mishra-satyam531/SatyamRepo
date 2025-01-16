package oops;

interface ICalcMachine{
	void add(int a, int b);
	void sub(int a, int b);
	void mul(int a, int b);
	void div(int a, int b);
}
class CalcMachineImp1 implements ICalcMachine{
	public void add(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}
	public void sub(int a, int b) {
		System.out.println("DIff is : " + (a - b));
	}
	public void mul(int a, int b) {
		System.out.println("Product is : " + (a * b));
	}
	public void div(int a, int b) {
		System.out.println("Div is : " + (a / b));
	}
}