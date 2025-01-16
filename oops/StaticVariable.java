package oops;

class Loan{
//	static variable
	static float rateOfInterest = 9.65f;
}
class StaticVariable{
	public static void main(String[] args) {
		System.out.println(Loan.rateOfInterest); //using ClassName
		System.out.println(new Loan().rateOfInterest); //using reference of the object
	}
}