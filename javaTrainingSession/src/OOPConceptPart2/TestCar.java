package OOPConceptPart2;

public class TestCar {

	// Method overriding > when same method exist in parent & child class then
	// preference is given to child class method.
	public static void main(String[] args) {

		// create object for parent class
		BMW b = new BMW();

		b.start();
		b.stop();
		b.refuel();
		b.safety();

		System.out.println("~~~~~~~~~~");

		Car c = new Car();

		c.start();
		c.stop();
		c.refuel();

		System.out.println("~~~~~~~~~~");

		// create new object
		// Top Casting
		// child class object can be referred by parent class reference variable --
		// dynamic polymorphism
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

		System.out.println("~~~~~~~~~~");
		b.engine();

		System.out.println("~~~~~~~~~~");
		b.company();

		System.out.println("~~~~~~~~~~");

		// Down Casting
		BMW b1 = (BMW) new Car(); // class cast exception

	}

}
