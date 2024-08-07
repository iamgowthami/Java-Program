package AUG07;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="jaj";
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
			
		}
		if(name.equalsIgnoreCase(rev)) {
			System.out.println(name+":palindrome");
		}else {
			System.out.println(rev+":not palindrome");
		}

		

	}

}
