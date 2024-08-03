package Aug02;

public class UppercaseCountInString {

	public static void main(String[] args) {
		String input ="GowThaMiSurEshReDDy";
		int count =0;
		for(int i=0;i<input.length()-1;i++) {
			char c= input.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				System.out.println("the Upper character is:"+c);
			}
		}
		System.out.println("toatal upper character is:"+count);

	}

}
