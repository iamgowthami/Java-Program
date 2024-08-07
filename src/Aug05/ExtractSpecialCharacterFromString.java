package Aug05;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String input="gow@!$256373737)(((((((";
		String characters=input.replaceAll("[^a-zA-Z]", "");
		System.out.println(characters);

	}

}
