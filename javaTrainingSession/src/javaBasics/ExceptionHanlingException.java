package javaBasics;

public class ExceptionHanlingException {

	public static void main(String[] args) {

		try {
			int i = 9 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("ABC");
	}

}
