package Aug16;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String name="gowthamigowtha";
		for(char c:name.toCharArray()) {
			if(name.indexOf(c)==(name.lastIndexOf(c))){
				System.out.println(c);
				
			}
		}

	}

}
