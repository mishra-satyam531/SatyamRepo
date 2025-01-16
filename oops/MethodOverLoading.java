package oops;

class Calculators{
	public void add(int a) {
		System.out.println("int argument");
	}
	public void add(float a) {
		System.out.println("float argument");
	}
}
class MethodOverLoading{
	public static void main(String[] args) {
		Calculators c = new Calculators();
		
		c.add('a'); //char ----> int
		c.add(9.5f); //float
		c.add((short)5); //short ----> int
		c.add(15L); //long ----> float
//		c.add(10.5);  //Compile Time Error, No suitable method found
	}
}