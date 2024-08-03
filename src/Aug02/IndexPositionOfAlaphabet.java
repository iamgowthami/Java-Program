package Aug02;

public class IndexPositionOfAlaphabet {

	public static void main(String[] args) {
		String sc="gowthamisuresh";
		char index='h';
		int indexposition =sc.indexOf(index);
		System.out.println("index letter:"+index);
		for(int i=0;i<sc.length();i++) {
			if(sc.charAt(i)==index) {
				System.out.println("index position:"+i);
			}
		}

	}

}
