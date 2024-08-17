package MorePraticeProgram;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String name="gowthami reddy i love you";
		int count=0;
		String space=" ";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
