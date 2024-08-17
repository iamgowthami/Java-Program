package Aug17;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String name="gowthami  Reddy  Ushika";
		int count=0;
		for(int i=0;i<name.length()-1;i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
