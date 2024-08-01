package July24;

public class PalindromeAString {

	public static void main(String[] args) {
		String input = "gowthami";
		String rev="";
		String original=input;
		int len = input.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("String is not palindrome:"+original);
		}else {
			System.out.println("String is not a palindrome:"+rev);
		}
		}

}
