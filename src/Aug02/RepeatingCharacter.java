package Aug02;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String sc="suresh";
		for(char c:sc.toCharArray()) {
			if(sc.indexOf(c)!=(sc.lastIndexOf(c))) {
			System.out.println("repeating character:"+c);	
			}
			
			
		}

	}

}
