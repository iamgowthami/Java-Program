package Aug11;

public class ReverseAString {

	public static void main(String[] args) {
		String input="gowthami";
		//String original=input;
		String rev=" ";
		char ch;
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
