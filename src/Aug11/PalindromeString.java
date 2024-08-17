package Aug11;

public class PalindromeString {

	public static void main(String[] args) {
		String name="karthik";
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
			
		}if(name.equalsIgnoreCase(rev)) {
			System.out.println(" palindrome:" +name);
		}else {
			System.out.println("not a palindrome:"+rev);
		}
		

	}

}
