package oops;

class Studentss{
//	instance variable
	String name;
	int age;
	
//	constructor
	Studentss(String naam, int umar){
		this.name = naam;
		this.age = umar;
	}
//	instance method
	public void disp() {
		System.out.println("Name is : " + name);
		System.out.println("Age is  : " + age);
	}
}
public class InstanceVariable{
	public static void main(String[] args) {
		Studentss s1 = new Studentss("Virat", 35);
		s1.disp();
		
		Studentss s2 = new Studentss("Satyam", 19);
		s2.disp();
	}
}