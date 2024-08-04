package Aug03;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String name = "GowThamiREDDY";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
				System.out.println("uper character is : " + c);

			}
		}
		System.out.println(count);
	}

}
