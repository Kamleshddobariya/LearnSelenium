package javaBasics;

public class ExceptionHanlingThrowable {

	public static void main(String[] args) {

		try {
			int i = 9 / 0;
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("ABC");
	}

}

