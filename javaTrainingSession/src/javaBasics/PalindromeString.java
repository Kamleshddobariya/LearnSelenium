package javaBasics;

public class PalindromeString {

	public static void main(String[] args) {

		if (isPalindrome("teeteet")) {
			System.out.println("Ture");
		} else {
			System.out.println("False");
		}

	}

	// reverse of number is same
	// for example: 151
	// string >> for example: teet

	public static boolean isPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		// System.out.println(j);

		while (i < j) {

			char fc = s.charAt(i);
			// System.out.println(fc);
			char lc = s.charAt(j);
			// System.out.println(lc);

			if ((fc) != (lc))

				return false;

			i++;
			j--;

		}

		return true;

	}

}
