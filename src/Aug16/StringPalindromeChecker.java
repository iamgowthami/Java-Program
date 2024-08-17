package Aug16;

public class StringPalindromeChecker {

	public static void main(String[] args) {
		String name="jaj";
		String rev="";
		char ch;
		String original=name;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
	  if(original.equalsIgnoreCase(rev)) {
		  System.out.println("palindrome:"+original);
	  }else {
		  System.out.println("not a palindrome:"+rev);
	  }

	}

}
