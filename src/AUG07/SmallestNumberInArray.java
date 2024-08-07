package AUG07;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int min=Integer.MAX_VALUE;
		for(int num:arr) {
			if(min>num) {
				min=num;
			}
		}
		System.out.println(min);

	}

}
