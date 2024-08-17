package Aug11;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String sc="gowtha  reddy   suresh";
		int count=0;
		for(int i=0;i<sc.length()-1;i++) {
			if((sc.charAt(i)==' ')) {
				count++;
			}
		}
		System.out.println(count);

	}

}
