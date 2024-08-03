package Aug02;

public class SmallestNumberAnArray {

	public static void main(String[] args) {
		int arr[]= {1,90,-1,89,100,45,6};
		int min = Integer.MAX_VALUE;
		for(int num:arr) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);

	}

}
