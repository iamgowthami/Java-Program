package AUG07;

public class UpperCaseCount {

	public static void main(String[] args) {
		String input="GOWthami";
		int count=0;
		for(int i=0;i<input.length()-1;i++) {
			char c=input.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
