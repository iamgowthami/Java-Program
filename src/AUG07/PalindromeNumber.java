package AUG07;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;

		int rev = 0;

		int original = num;

		while (num != 0) {

		rev = rev * 10 + num % 10;

		num = num / 10;

		}

		if (original == rev) {

		System.out.println(original + " number is palidrome");

		} else {

		System.out.println(rev + " num is not palidrome");

		}

	}

}
