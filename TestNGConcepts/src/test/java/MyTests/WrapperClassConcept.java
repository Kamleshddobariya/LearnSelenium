package MyTests;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);
		
		//data conversion: String to int
		// Integer is wrapper class
		int i = Integer.parseInt(x);
		System.out.println(i + 20);
		
		//Other wrapper class: Double, Character, Boolean
		
		//String to Double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j = 100;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		

	}

}
