package Aug14;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="Gowthami123!@@##(#(#*#&&#^#^#^%#%";
		String replace=name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(replace);

	}

}
