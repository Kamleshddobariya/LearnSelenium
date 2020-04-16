package javaBasics;

public class ConstructorWithThisKeyword {

	// class variables
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		// to use global variable inside constructor we need to use this keyword

		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Kamlesh", 30);

	}

}
