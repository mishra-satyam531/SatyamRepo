package strings;

public class InternMethod {

	public static void main(String[] args) {
		String str1 = new String("Hello");  // Creates a new string object in heap memory
        String str2 = new String("Hello");  // Creates another new string object in heap memory
        
        // Using intern() methods --> The intern() method checks if a string with the same value already exists in the String Pool
        String internedStr1 = str1.intern(); //The intern() method finds that "Hello" already exists in the pool (placed there during
//        the creation of the string literal "Hello") and returns its reference.
        String internedStr2 = str2.intern(); //The intern() method also finds the same "Hello" in the pool and returns the same reference.

        // Comparing references
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("internedStr1 == internedStr2: " + (internedStr1 == internedStr2)); // true (same reference)

        // Comparing values
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)
        System.out.println("internedStr1.equals(internedStr2): " + internedStr1.equals(internedStr2)); // true (same content)
        
        System.out.println(str1 == internedStr1);
        System.out.println(str1 == internedStr2);
        System.out.println(str2 == internedStr1);
        System.out.println(str2 == internedStr2);
        
        System.out.println(internedStr1 == internedStr1);
        System.out.println(internedStr2 == internedStr2);		
	}

}
