package javaBasics;

public class PrimeNumber {
	// 2 is the lowest prime number
	// 3 is the next lowest prime number
	public static boolean isPrimeNumber(int num) {

		// edge/corner cases:

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // check if number/2 reminder is 0
				return false;
			}
		}

		return true;
	}

	public static void getPrimeNumber(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		// prime number : can be divide by only itself

//		// for example: 13 >> 13/13
//		for (int j = -1; j <= 20; j++) {
//			System.out.println(+j + " is prime number : " + isPrimeNumber(j));
//		}
//		
		getPrimeNumber(20);

	}

}
