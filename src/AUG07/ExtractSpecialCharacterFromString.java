package AUG07;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="GOwthami@!@##I#**#*#G#123GJRIYE$YE";
		String specialchars=name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(specialchars);
	}

}
