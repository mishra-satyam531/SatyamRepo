package oops;

class Student{
//	Data Security
	private int rollNo;
	private String name;
	private int age;
	
//	Setter methods
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	Getter methods
	public int getRollNo() {
		return this.rollNo;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
class StudentApp{
	public static void main(String[] args) {
		Student s1 = new Student();
		
//		calling setter methods
		s1.setRollNo(57);
		s1.setName("Satyam");
		s1.setAge(19);
		
//	    calling getter methods
		System.out.println("Roll no. is : " + s1.getRollNo());
		System.out.println("Name is     : " + s1.getName());
		System.out.println("Age is      : " + s1.getAge());
	}
}