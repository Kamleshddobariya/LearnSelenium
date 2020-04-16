package javaBasics;

public class ArmstrongNumber {

	// 153 OR 407
	// 1*1*1 = 1
	// 5*5*% = 125
	// 3*3*3 = 27
	// 1+ 125 + 27 = 153

	public static void isArmstrongNumber(int num) {

		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("This is an armstrong number");
		} else {
			System.err.println("This is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(371);
		isArmstrongNumber(407);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
	}

}
