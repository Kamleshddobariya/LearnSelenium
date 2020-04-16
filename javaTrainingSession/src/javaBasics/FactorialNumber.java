package javaBasics;

public class FactorialNumber {

	public static void findFactorial(int num) {

		int factorial = num;

		if (num == 0) {
			factorial = 1;
		} else {
			for (int j = 1; j <= num - 1; j++) {
				factorial = factorial * (num - j);
			}

		}

		System.out.println(factorial);
	}

	// recursive function >> it is calling itself

	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * fact(num - 1));
	}

	public static void main(String[] args) {

		findFactorial(5);
		System.out.println(fact(6));

	}

}
