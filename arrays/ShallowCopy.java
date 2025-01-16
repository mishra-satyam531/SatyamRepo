package arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 1, 6, 4};
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		int [] nums = arr;
		for (int ele : nums) {
			System.out.print(ele + " ");
		}
		System.out.println();
		nums[0] = 10;
		System.out.println(nums[0]);
		System.out.println(arr[0]);
	}

}
