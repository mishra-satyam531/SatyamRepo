package oops;

class Samples{
	public void methodOne(String s) {
		System.out.println("String version");
	}
	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}
	public void methodOne(Object o) {
		System.out.println("Object version");
	}
}
class MethodOverLoading4{
	public static void main(String[] args) {
		Samples s = new Samples();
		
		s.methodOne(new String("Satyam"));// String ---> String
		s.methodOne(new StringBuffer("Magnus"));//StringBuffer ---> StringBuffer
		s.methodOne(new Object());// Object ---> Object
//		Compiler - mother, Object - father, other classes child
//		s.methodOne(null);// null ---> String(refernce), StringBuffer(reference), Object(reference) // ambiguity
	}
}