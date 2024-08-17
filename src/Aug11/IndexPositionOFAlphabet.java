package Aug11;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String name="gowthami";
		char index='i';
		int postion=name.indexOf(index);
		System.out.print("Index positions of '" + index + "' are: ");
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==index) {
				System.out.println(i+"");
			}
		}

	}

}
