package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// Integer.parseInt(data conversion string into integer
		// Integer is wrapper class

		// Integer, Double, Boolean, String.valueOf >> These are different wrapper
		// classes

		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i + 20);

		// string to double conversion
		String y = "10.99";
		double d = Double.parseDouble(y);
		System.out.println(d + 10.00);

		// string to boolean:
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to string conversion
		int age = 60;
		String s = String.valueOf(age);
		System.out.println(s);

		// This will give us exception for number format
		String u = "100A";
		int j = Integer.parseInt(u);

	}

}
