package javaBasics;

public class PalindromeNumber {

	public static void main(String[] args) {

		isPalindrome(15151);

	}

	// reverse of number is same
	// for example: 151
	public static void isPalindrome(int num) {

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10; // get the reminder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("palindrom number");
		} else {
			System.out.println("not palindrom number");
		}

	}

}
