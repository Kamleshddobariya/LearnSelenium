package javaBasics;

public class ExceptionHandling {

	int a = 10;

	public static void main(String[] args) {

		// uncaught exception
		// int i = 9 / 0;
		// System.out.println(i);

		// caught exception
		// Thread.sleep(1000);

//		ExceptionHandling obj = null;
//		System.out.println(obj);

//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;
//		System.out.println(obj.a);

		// try catch block to handle error exception
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("ABC");
	}

}
