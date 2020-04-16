package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	String name = "Manoj"; // non static Global variable
	static int age = 30; // static global variable

	public static void main(String[] args) {

		// how to call static methods and variables
		// 1. direct calling:
		sum();

		// 2. calling by class name:
		StaticAndNonStaticConcept.sum();

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// how to call non static method
		StaticAndNonStaticConcept Obj = new StaticAndNonStaticConcept();
		Obj.sendMail();
		System.out.println(Obj.name);
		System.out.println(Obj.age);

	}

	public void sendMail() { // non static method
		System.out.println("send mail method");
	}

	public static void sum() { // static method
		System.out.println("sum method");
	}

}
