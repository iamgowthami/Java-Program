package Aug11;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="gowthami@!@##$**$*$($(123";
		String replace=name.replaceAll("[^A-za-z0-9]", "");
		System.out.println(replace);

	}

}
