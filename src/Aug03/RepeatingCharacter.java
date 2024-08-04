package Aug03;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String input="ushikareddy";
		for(char c:input.toCharArray()) {
			if(input.indexOf(c)!=(input.lastIndexOf(c))) {
				System.out.println("repeating character:"+c);
			}
		}

	}

}
