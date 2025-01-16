package arrays;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int[] arr = {4, 8, 7, 5, 9, 8, 9, 4, 9};
		int l = arr.length;
		 for(int i=0; i<l; i++) {
			 boolean flag = false;
			 for(int j=0; j<l; j++) {
				 if( i != j && arr[i] == arr[j]) {
					 flag = true;
					 break;
				 }
			 }
			 if(!flag) {
				 System.out.print("First non repeating element is: " + arr[i]);
				 break;
			 }
		 }
		
	}

}
