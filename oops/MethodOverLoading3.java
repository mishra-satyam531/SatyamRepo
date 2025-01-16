package oops;

class Sample{
	public void methodOne(String s) {
		System.out.println("String version");
	}
	public void methodOne(Object o) {
		System.out.println("Object version");
	}
}
class MethodOverLoading3{
	public static void main(String[] args) {
		Sample s = new Sample();
		
		s.methodOne("Satyam");// String ---> String
		s.methodOne(new StringBuffer("Virat"));// StringBuffer ---> Object
		s.methodOne(new Object());// Object ---> Object
//		Compiler - mother, Object - father, other classes child
		s.methodOne(null);// null ---> String(refernce), Object(reference), String winner as it is a child
	}
}