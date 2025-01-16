package oops;

class Employees{
//	Instance variable
	String name;
	int age;
	
//	Zero Argument Constructor
	Employees(){
		System.out.println("Employee constructor called");
	}
	
//	Instance method
	public void disp() {
		System.out.println("Name is : " + name);
		System.out.println("Age is  : " + age);
	}
}
class Constructor{
	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.disp();
	}
}