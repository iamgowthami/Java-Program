package Aug02;

public class NonReaptingCharacter {

	public static void main(String[] args) {
		String sc="ushikasuresh";
		for(char c:sc.toCharArray()) {
			if((sc.indexOf(c)==(sc.lastIndexOf(c)))){
				System.out.println("non repeating character:"+c);
				
			}
		}

	}

}
