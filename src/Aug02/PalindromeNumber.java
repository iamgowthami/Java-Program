package Aug02;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123123;
		int rev=0;
		int original=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original==rev) {
			System.out.println("Palindrome number:"+original);
			
		}else {
			System.out.println("Not Palindrome number:"+rev);
		}

	}

}
