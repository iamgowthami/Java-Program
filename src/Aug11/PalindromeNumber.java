package Aug11;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}if(num==rev) {
			System.out.println("palindrome:"+num);
		}else {
			System.out.println("not a palindrome:"+rev);
		}

	}

}
