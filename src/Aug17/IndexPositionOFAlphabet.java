package Aug17;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String name = "gowthami";
		char index = 'o';
		int position = name.indexOf(index);
		System.out.print("Index positions of '" + index + "' are: ");

		for (int i = 1; i < name.length(); i++) {
			if (name.charAt(i) == index) {
				System.out.println(i+"");
			}
		}

	}

}
