package oops;

abstract class Human{
	String name;
	int age;
	float height;
	
	Human(String name, int age, float height){ //abstract class has constructor
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
class Scholar extends Human{
	int marks;
	float avg;
	
	Scholar(String name, int age, float height, int marks, float avg){
		//To call parameterised consturctor of parent from child class
		super(name, age, height);
		this.marks = marks;
		this.avg = avg;
	}
	
	public void disp() {
		System.out.println("Name is    : " + name);
		System.out.println("Age is     : " + age);
		System.out.println("Height is  : " + height);
		System.out.println("Marks is   : " + marks);
		System.out.println("Average is : " + avg);
	}
}
public class AbstractClass2{
	public static void main(String[] args) {
		Scholar s = new Scholar("Satyam", 19, 5.3f, 70, 8.5f);
		
		s.disp();
	}
}