package Aug16;

public class WordCountInString {

	public static void main(String[] args) {
		String name="gowthami reddy";
		String space=" ";
		int count=1;
		for(int i=1;i<name.length();i++) {
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' ')){
				count++;
				
			}
		}
		System.out.println(count);
	}

}
