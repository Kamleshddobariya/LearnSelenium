package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(100); // 0 store in terms of indexes
		ar.add(200); // 1
		ar.add(300); // 2

		System.out.println(ar.size());

		ar.add(400); // 3
		ar.add(500); // 4

		System.out.println(ar.size());

		// can add(store) different data type
		// add is existing method

		ar.add("Tom"); // 5
		ar.add("Hello"); // 6
		ar.add(12.33); // 7
		ar.add('F'); // 8
		ar.add(600); // 9

		System.out.println(ar.size());

		ar.remove(9);

		System.out.println(ar.size());

		System.out.println(ar.get(4));

		// to print all the values of ArrayList

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new ArrayList();

		ar1.add(100);
		// ar1.add("Kamlesh");

		ArrayList<String> ar2 = new ArrayList();

		// ar2.add(100);
		ar2.add("Kamlesh");

	}

}
