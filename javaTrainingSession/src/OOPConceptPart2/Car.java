package OOPConceptPart2;

public class Car extends Vehicle {
	
//	//Method hiding
//	public static void start() {
//		System.out.println("Car---start");
//	}
	
	public void start() {
		System.out.println("Car---start");
	}

	public void stop() {
		System.out.println("Car---stop");
	}

	public void refuel() {
		System.out.println("Car---refuel");
	}
}
