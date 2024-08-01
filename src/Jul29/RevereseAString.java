package Jul29;

public class RevereseAString {

	public static void main(String[] args) {
		String name = "gowthamiReddy";
		String rev = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			rev = ch + rev;

		}
		System.out.println(rev);

	}

}
