package strings;

public class InterningAndNewKeyword {

	public static void main(String[] args) {
		String s = "Satyam"; //yaha pe s me Satyam store nhi hua h instead wo only Satyam ko point kar rha hai
		s = "Mishra"; // yaha string change nhi hui h as they are immutable but s ab Mihsra ko point kr rha hai 
		System.out.println(s);
		
		String q = "Satyam"; //yaha pe koi naya object nhi bana h
		System.out.println(q);
		
//		s.charAt(0) = 'H'; Error as strings are immutable
		
//		TO CREATE A NEW OBJECT
		String a = new String("Mishra");
		System.out.println(a);
	}

}
