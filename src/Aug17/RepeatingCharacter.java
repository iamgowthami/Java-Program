package Aug17;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String name="gowthamireddy";
		int count=0;
		for(char c:name.toCharArray()) {
			if(name.indexOf(c)!=(name.lastIndexOf(c))) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);

	}

}
