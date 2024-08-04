package Aug03;

public class ReverseAString {

	public static void main(String[] args) {
		String name="gowthamireddy";
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
