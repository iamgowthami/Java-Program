package Aug11;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String name="gowthamiGOWTHAMI";
		int count=0;
		for(int i=0;i<=name.length()-1;i++) {
			char c=name.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);

	}

}
