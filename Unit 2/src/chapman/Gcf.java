package chapman;

import java.util.Scanner;

/**
 * Gcf.java The program compares 2 numbers entered by the user and finds the
 * greatest common factor between them. April 4 2017
 * 
 * @author Roger Chapman
 */
public class Gcf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int number = s.nextInt();
		int number2 = s.nextInt();
		int a = greatestCommonFactor(number, number2);
		System.out.println(a);
	}
	/**
		 * The method determines the greatest common factor between the numbers
		 * given
		 * 
		 * @param "num1"
		 *            and "num2" These are the two numbers entered by the user
		 *            which the method will use when attempting to find the GCF
		 * @return "n" This is the greatest common factor between the numbers
		 *         given
		 */
	public static int greatestCommonFactor(int num1, int num2) {
		
		int big = Math.max(num1, num2);
		int small = Math.min(num1, num2);
		int n = small;
		while (!isDivisible(small,n) || !isDivisible(big,n)) {
			n--;
		}
		return n;
	}

	/**
	 * The method checks if the numerator is divisible by the denominator
	 * @param "numerator" and "denominator" These are the numbers entered by the user
	 * @return true/false This depends on whether or not the numerator is divisible by the denominator
	 */
	public static boolean isDivisible(int numerator, int denominator) {
		if (numerator % denominator == 0) {
			return true;
		} 
		return false;
	}
}
