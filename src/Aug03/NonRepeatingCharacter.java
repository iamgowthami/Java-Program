package Aug03;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String input="suresh";
		for(char c:input.toCharArray()) {
			if(input.indexOf(c)==(input.lastIndexOf(c))) {
				System.out.println("non repeating character:"+c);
			}
			
		}

	}

}
