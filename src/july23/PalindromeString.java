package july23;

public class PalindromeString {

	public static void main(String[] args) {
		String input= "jahaj";
		String original=input;
		String rev="";
		int len= input.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("string is a palindrom:"+original);
			
		}else {
			System.out.println("String is not a palindrome:"+rev);
		}
		

	}

}
