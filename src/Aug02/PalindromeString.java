package Aug02;

public class PalindromeString {

	public static void main(String[] args) {
		String name="jij";
		String rev="";
		char ch;
		String original=name;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("palidrome String:"+original);
		}else {
			System.out.println(" String not a palindrome :"+rev);
		}

	}

}
