package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {

		// + : is concatenation operator

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double c = 10.50;
		double d = 20.50;

		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(x + y + c + d);

		System.out.println("Value of a is: " + a);
		System.out.println("Value of a is: " + b);
		System.out.println("Value of a+b is: " + (a + b));

	}

}
