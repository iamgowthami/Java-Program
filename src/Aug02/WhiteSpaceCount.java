package Aug02;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String input="gowthami re  ddy suresh";
		int count =0;
		for(int i=1;i<input.length()-1;i++) {
			if(input.charAt(i)== ' ') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
