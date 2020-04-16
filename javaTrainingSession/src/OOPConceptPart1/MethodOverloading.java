package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading Obj = new MethodOverloading();

		Obj.sum();
		Obj.sum(10);
		Obj.sum(10, 5);
	}

	// main method can be overloaded
	public static void main(int p) {

	}

	public static void main(int q, int r) {

	}

	// Method overloading >> when method name is same with different arguments
	// same method name is not allowed.
	// need to differentiate same methods using different data type input parameter
	// this called method overriding
	// you can not create a method inside a method

	public void sum() { // zero input parameter
		System.out.println("Sum method - zero input parameter");

	}

	public void sum(double d) { // one input parameter
		System.out.println("Sum method - 1 input parameter");
	}

	public void sum(int x) { // one input parameter
		System.out.println("Sum method - 1 input parameter");
	}

	public void sum(int k, int l) {
		System.out.println("sum method - 2 input parameter");
	}

}
