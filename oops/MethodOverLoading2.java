package oops;

class Calc{
	public void add(int a, float b) {
		System.out.println("int-float argument");
	}
	public void add(float a, int b) {
		System.out.println("float-int argument");
	}
}
class MethodOverLoading2{
	public static void main(String[] args) {
		Calc c = new Calc();
		
		c.add(10, 25.5f);
		c.add(25.5f, 100);
//		c.add(10, 20); //Compile Time Error : ambiguous
	}
}