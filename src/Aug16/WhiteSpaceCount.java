package Aug16;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String name="Gowthami  reddy I Love";
		String space =" ";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
