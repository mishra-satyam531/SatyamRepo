package oops;

class Employee{
//	Data Security
	private String eid;
	private String name;
	private int age;
	private String eaddress;
	
//	Setter methods
	public void setEid(String eid) {
		this.eid = eid;
	}
	public void setName(String nAme) {
		this.name = nAme;
	}
	public void setAge(int Age) {
		this.age = Age;
	}
	public void setaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
//	Getter methods
	public String geteid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public int getAbe() {
		return age;
	}
	public String getAddress() {
		return eaddress;
	}
}
public class EmployeeApp{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEid("jgcjs");
		e1.setName("Satyam");
		e1.setAge(19);
		e1.setaddress("Delhi");
		
		System.out.println("ID is 	   : " + e1.geteid());
		System.out.println("Name is    : " + e1.getName());
		System.out.println("Age is     : " + e1.getAbe());
		System.out.println("Address is : " + e1.getAddress());
	}
}