package OOPConceptPart1;

public class Car {

	// global variable
	// class variable
	int mod;
	int wheel;

	public static void main(String[] args) {

		// create object
		// new is the operator to create object
		// a,b, & c are object reference variables

		Car a = new Car(); // Represent one object //a is refereeing this object
		Car b = new Car();
		Car c = new Car();

		// initialize variable to each objects
		a.mod = 2020;
		a.wheel = 4;

		b.mod = 2019;
		b.wheel = 6;

		c.mod = 2015;
		c.wheel = 4;

		System.out.println("before assinging reference");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println("---");

		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println("---");

		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("---");

		System.out.println("after assinging reference");

		// shifting of one object to other
		a = b;
		b = c;
		c = a;

		a.mod = 10;
		System.out.println(a.mod); // 10
		c.mod = 20;
		System.out.println(a.mod); // 20
		System.out.println(c.mod); // 20
	}

}
