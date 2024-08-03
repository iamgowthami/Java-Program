package Aug03;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {0,-1,3,6,7,89,100};
		int min=Integer.MAX_VALUE;
		for(int num:arr) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);

	}

}
