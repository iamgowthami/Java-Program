package Aug03;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String input="gowthami@123&((@(*W*";
		String specialchar= input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(specialchar);

	}

}
