package javaBasics;

public class ConstructorConcept {

	// constructor is not function and not return anything
	// default constructor with zero parameter

	public ConstructorConcept() {
		System.out.println("This is default constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("single param consturctor");
		System.out.println("The value of :" + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("two param consturctor");
		System.out.println("The value of :" + i);
		System.out.println("The value of :" + j);
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}

}
