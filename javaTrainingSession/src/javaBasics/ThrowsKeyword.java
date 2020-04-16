package javaBasics;

public class ThrowsKeyword {

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
		
	}

	// Throws keyword is also use to handle exception
	// used when we have method chaining
	// it is always put in front of method
	
	public void sum() {
		try {
			div();
		} catch(ArithmeticException e) {
			
		}
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
	}

}
