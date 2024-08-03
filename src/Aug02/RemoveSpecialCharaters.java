package Aug02;

public class RemoveSpecialCharaters {

	public static void main(String[] args) {
		String input="gowthai124325i@11``4i8????***@@@^";
		String rm=input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("remove special characters:"+rm);

	}

}
