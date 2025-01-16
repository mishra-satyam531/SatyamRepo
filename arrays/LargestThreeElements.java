package arrays;

public class LargestThreeElements {

	public static void main(String[] args) {
		int[] arr = {56, 32, 49, 79, 15, 30, 30, 56};
		int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE, tl = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(fl < arr[i]) {
				tl = sl;
				sl = fl;
				fl = arr[i];
			}else if(sl < arr[i] && arr[i]<fl) {
				tl = sl;
				sl = arr[i];
			}else if(tl<arr[i] && arr[i] < sl) {
				tl = arr[i];
			}
		}
		System.out.println("Largest Element is : " + fl);
		System.out.println("Second Largest Element is : " + sl);
		System.out.println("Third Largest Element is : " + tl);
	}

}
