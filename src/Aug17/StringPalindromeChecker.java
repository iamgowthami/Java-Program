package Aug17;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		String input="jajaja";
		String rev="";
		String original=input;
		char ch;
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			rev=ch+rev;
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("String palindrome:"+original);		
			
	}else {
		System.out.println("String not palindrome:" +rev);		
		
			
		}

		
	}

}
