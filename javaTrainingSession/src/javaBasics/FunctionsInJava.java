package javaBasics;

public class FunctionsInJava {

	public static void main(String[] args) {

		// create the object of class.
		FunctionsInJava obj = new FunctionsInJava();

		obj.test();

		int d = obj.sum();
		System.out.println(d);

		int ans = obj.div(200, 100);
		System.out.println(ans);

		String s = obj.name();
		System.out.println(s);

		String s1 = obj.sendMail(100, "box");
		System.out.println(s1);

	}

	// 1. no input no output type function
	// void means doesn't return any value
	public void test() {
		System.out.println("test method");
	}

	// 2. no input some output
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;

	}

	public String name() {
		System.out.println("name method");
		String s = "Kamlesh";

		return s;
	}

	// 3. some input some output:
	public int div(int x, int y) {
		System.out.println("Div Method");
		int z = x / y;

		return z;
	}

	// 4.
	public String sendMail(int p, String q) {
		System.out.println("sendMail method");
		String h = p + q;

		return h;

	}

}
