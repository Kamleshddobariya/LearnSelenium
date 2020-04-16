package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// array: to store similar data type in a array variable

		// 1. int array:
		// lowest bound/index = 0
		// upper bound/index = n-1(n is size of array)
		// one dim array

		// disadvantage of array:
		// 1. static array - we can store data limited to size >> To overcome this issue
		// -- we use collection -- ArrayList, HashTable -- use dynamic array
		// 2. store only similar data type only >> To overcome this issue, we use object
		// array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println("===========");
		// System.out.println(i[4]); // array index out of bound exception error

		System.out.println(i.length); // size/length of array
		System.out.println("===========");

		// print all the values of array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("===========");

		// 2. double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 15.50;
		d[2] = 120.99;

		System.out.println(d[2]);
		System.out.println("===========");

		// 3. char array
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = 'B';

		System.out.println(c[1]);
		System.out.println("===========");

		// 4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[1]);
		System.out.println("===========");

		// 5. String array
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "world";

		System.out.println(s.length);
		System.out.println(s[1]);
		System.out.println("===========");

		// 6. Object Array:
		// Object is super class of all the class
		// It used to store different data type values

		Object ob[] = new Object[5];
		ob[0] = "Kanvi";
		ob[1] = 4;
		ob[2] = 'F';
		ob[3] = "31/10/2015";
		ob[4] = "surat";

		System.out.println(ob.length);
		System.out.println(ob[4]);
		System.out.println("===========");

		for (int k = 0; k < ob.length; k++) {
			System.out.println(ob[k]);
		}

		System.out.println("===========");
	}

}
