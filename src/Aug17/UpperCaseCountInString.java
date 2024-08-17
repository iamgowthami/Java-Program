package Aug17;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String name="GOWThami";
		int count=1;
		for(int i=1;i<name.length();i++) {
			char c=name.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);

	}

}
