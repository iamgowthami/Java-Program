package Aug11;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String name="gowtha";
		for(char c:name.toCharArray()) {
			if(name.indexOf(c)== (name.lastIndexOf(c))){
				System.out.println(c);
				
			}
		}

	}

}
