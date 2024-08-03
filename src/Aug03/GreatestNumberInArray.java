package Aug03;

public class GreatestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {22,89,100,899,300,89};
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println(max);
		

	}

}
