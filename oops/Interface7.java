package oops;

interface ICalcHelper{
//	public abstract
	public void add(int a, int b);
	abstract void sub(int a, int b);
}
interface IAdvCalcHelper extends ICalcHelper{
//	public abstract
	void mul(int a, int b);
	void div(int a, int b);
}
class CalcImp11 implements IAdvCalcHelper{
	public void add(int a, int b) {
		System.out.println("Sum is : "  + (a + b));
	}
	public void sub(int a, int b) {
		System.out.println("Diff is : " + (a - b));
	}
	public void mul(int a, int b) {
		System.out.println("Prod is : " + (a * b));
	}
	public void div(int a, int b) {
		System.out.println("Div is : " + (a / b));
	}
}
public class Interface7{
	public static void main(String[] args) {
		//loose coupling : Polymorphism
		IAdvCalcHelper c = new CalcImp11();
		c.add(100, 20);
		c.sub(100, 20);
		c.mul(100, 20);
		c.div(100, 20);
		
	}
}