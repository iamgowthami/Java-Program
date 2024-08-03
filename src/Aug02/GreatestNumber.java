package Aug02;

public class GreatestNumber {

	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 6, 8, 2, 33, 3345, };
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(max<num) {
			max=num;
		}
		}
		System.out.println(max);

	}

}
