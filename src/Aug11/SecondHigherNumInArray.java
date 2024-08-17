package Aug11;

public class SecondHigherNumInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,56,7,90};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second &&num!=first) {
				num=second;
				
			}
		}
		System.out.println(second);
	}

}
