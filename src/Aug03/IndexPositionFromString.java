package Aug03;

public class IndexPositionFromString {

	public static void main(String[] args) {
		String name="gowthami";
		char index='t';
		int indexposition= name.indexOf(index);
		for(int i=1;i<name.length();i++) {
			if(name.charAt(i)==index) {
				System.out.println(i);
			}
		}
		

	}

}
