package oops;

class Calculator{
	public void add(int a, int b) { //local variable
		int result = a + b;
		System.out.println("The sum is : " + result);
	}
}
class LocalVariable{
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(10, 20);
	}
	
	
}