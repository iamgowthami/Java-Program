package Aug02;

public class WordCountInString {

	public static void main(String[] args) {
		String sc="gowthami    reddy ushika";
		int count=1;
		for(int i=1;i<sc.length()-1;i++) {
			if((sc.charAt(i)==' ') && (sc.charAt(i+1)!=' ')){
				count++;
				
			}
		}
		System.out.println(count);
		 

	}

}
