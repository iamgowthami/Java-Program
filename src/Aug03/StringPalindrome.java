package Aug03;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="jahaj";
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("String palindrome:"+rev);
		}else {
			System.out.println("String not a palindrome:"+rev);
		}

	}

}
