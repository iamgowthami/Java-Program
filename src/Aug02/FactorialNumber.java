package Aug02;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 4;
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			
		}
		System.out.println("the factorial of"+num+"is"+factorial);

	}

}
