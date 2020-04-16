package javaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {

		// 1. while loop:

		int i = 1; // initialization

		while (i <= 10) { // conditional
			System.out.println(i);
			i = i + 1; // incremental/decrement
		}

		System.out.println("===========");

		// 2. for loop:
		for (int j = 1; j <= 10; j++) { // initialization | conditional | incremental
			System.out.println(j);
		}

		System.out.println("===========");

		// 2. for loop:
		for (int k = 10; k >= -10; k--) { // initialization | conditional | incremental
			System.out.println(k);
		}

	}

}
