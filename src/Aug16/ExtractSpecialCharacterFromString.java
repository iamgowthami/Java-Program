package Aug16;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String name="gowthami@1233o4995(#((&*@*&*(@(@)@)";
		String replacechar=name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(replacechar);

	}

}
