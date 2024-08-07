package Aug05;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String input = "gowthami";
		char index='t';
		int indexposition=input.indexOf(index);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==index) {
				System.out.println(i+"");
			}
		}

	}

}
