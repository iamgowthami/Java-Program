package july23;

public class PolindromeNumber {

	public static void main(String[] args) {
		int num =135;
		int rev=0;
		int original=num;
		while(num !=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original==rev) {
			System.out.println(original+"it is a palindrome" );
		}else {
			System.out.println(rev+"it is not a palindrome");
		}
		

	}

}
