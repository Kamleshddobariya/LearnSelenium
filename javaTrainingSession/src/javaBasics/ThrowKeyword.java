package javaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");

		// Throw keyword is use when you want to throw exception deliberately

		try {
			throw new Exception("Kamlesh Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("PQR");

		String Exce_Flag = " ";
		if (Exce_Flag.equalsIgnoreCase(" ")) {
			try {
				throw new Exception("Exec flag is No");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Test");
	}
		
}
