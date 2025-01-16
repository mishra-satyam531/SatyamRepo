package oops;

interface IDemo{
//	public static final
	int x = 10;
}
public class Interface9 implements IDemo{
	public static void main(String[] args) {
		int x = 100;//local variable
		System.out.println(x);
		System.out.println(IDemo.x);
		System.out.println(Interface9.x);
	}
}