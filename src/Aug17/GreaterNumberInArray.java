package Aug17;

public class GreaterNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 8, 2, 33, 3345, 55 };
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (max < num) {
				max = num;

			}

		}
		System.out.println(max);

	}

}
