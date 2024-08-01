package Jul29;

public class PalindromeAString {

	public static void main(String[] args) {
		String s="amma";
		String rev="";
		String original=s;
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("String is a palindrome:"+original);
		}else {
			System.out.println("string is not a palindrome:"+rev);
		}

	}

}
