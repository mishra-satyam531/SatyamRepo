package oops;

class Person{ //Base class or Parent class or Super Class
	public String name;
	public String address;
	public int age;
	
}
class Students extends Person{ //Derived Class or Sub Class or Child Class
	public int marks;
	public String grade;
	
//	Constructor
	Students(String nAme, String address, int age, int marks, String grade){
		this.name = nAme;
		this.address = address;
		this.age = age;
		this.marks = marks;
		this.grade = grade;
	}
	
//	normal method
	public void disp() {
		System.out.println("Name is    : " + name);
		System.out.println("Address is : " + address);
		System.out.println("Age is     : " + age);
		System.out.println("Marks is   : " + marks);
		System.out.println("Grade is   : " + grade);
	}
}
class Inheritance{
	public static void main(String[] args) {
		Students s1 = new Students("Virat", "RCB", 35, 100, "A");
		
		s1.disp();
	}
}