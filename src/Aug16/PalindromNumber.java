package Aug16;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=121;
		int rev=0;
		int original = num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original == rev) {
			System.out.println("palindrome:"+original);
		}else {
			System.out.println("not a palindrome num:"+rev);
		}

	}

}
