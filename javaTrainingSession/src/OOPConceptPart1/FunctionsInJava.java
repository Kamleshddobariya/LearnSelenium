package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		// we need one object
		// after creating object, the copy of all static methods will be given to this
		// object
		FunctionsInJava obj = new FunctionsInJava();

		obj.methodname();

		int l = obj.abc();
		System.out.println(l);

		String s1 = obj.qa();
		System.out.println(s1);

		int m = obj.division(200, 100);
		System.out.println(m);

	}

	// functions and methods are same thing
	// non static methods
	// functions are like factory >>
	// void means return no value
	//

	public void methodname() { // no input no output

		System.out.println("methodname");

	}

	public int abc() { // no input but some output

		System.out.println("abc method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	public String qa() { // no input but some output
		System.out.println("qa method");
		String s = "Selenium";

		return s;
	}

	// x, y are input parameter or input arguments
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x / y;

		return d;

	}

}
