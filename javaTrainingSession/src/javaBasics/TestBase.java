package javaBasics;

public class TestBase {

	// JVM - try to search below method - otherwise it'll not execute the program

	public static void main(String[] args) {

		System.out.println("str array main method-1");

		main(10);
		main("Testing");
		main(10, 20);

	}

	public static void main(int a) {

		System.out.println("int main method-2");

	}

	public static void main(String args) {

		System.out.println("main method-3");

	}

	public static void main(int a, int b) {

		System.out.println("main method-4");

	}

//Method overloading like below
//	t1()
//	t1(int a)
//	t1(int a, int b)
}
