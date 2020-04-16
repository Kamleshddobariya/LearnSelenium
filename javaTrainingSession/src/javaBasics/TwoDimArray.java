package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];

		System.out.println(x.length); // Total number of rows = 3
		System.out.println(x[0].length); // Total number of columns = 5

		// how to store(initialize) data in 2-D array

		// first row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";

		// second row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		// third row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[0][2]);
		System.out.println(x[1][3]);
		System.out.println(x[2][4]);
		System.out.println("==============");

		// print all the values in 2d array

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}
			System.out.println("----");
		}

	}

}
