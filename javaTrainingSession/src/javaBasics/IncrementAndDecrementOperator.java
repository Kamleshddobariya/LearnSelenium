package javaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int i = 1;
		int j = i++; // post increment

		System.out.println(i);
		System.out.println(j);
		System.out.println("===========");

		int a = 1;
		int b = ++a; // pre increment

		System.out.println(a);
		System.out.println(b);
		System.out.println("===========");

		int m = 2;
		int n = m--; // post decrement

		System.out.println(m);
		System.out.println(n);
		System.out.println("===========");

		int p = 2;
		int q = --p; // pre decrement

		System.out.println(p);
		System.out.println(q);
		System.out.println("===========");

	}

}
