package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		// put is method
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");

		System.out.println(h.size());

		h.put(1, 100);
		h.put(2, 200);

		System.out.println(h.size());

		System.out.println(h.get("C"));
		System.out.println(h.get(1));

		// we can give any combination i.e. key is integer & value is string
		h.put(3, "Kamlesh");

		Hashtable<Integer, Integer> h1 = new Hashtable();

		h1.put(1, 100);
		h1.put(2, 200);

		Hashtable<Integer, String> h2 = new Hashtable();

		h2.put(1, "abc");
		h2.put(2, "xyz");

	}

}
