/**
 * 
 */
package chapman;

import java.util.Scanner;

/**
 * PerfectTriple.java
 * April 20 2017
 * The program checks all values for 2 numbers from 0-100 and sees if they can be squared and added to get a third value. Then all of these possibilities are printed.
 *
 */
public class PerfectTriple {

	public static void main(String[] args) {
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				double z = Math.pow(x, 2) + Math.pow(y, 2);
				if (isSquare(x, y) == true) {
					System.out.println(x + "+" + y + "=" + z);

				}
			}
		}

	}
/**
 * The method checks if each variable is a perfect square
 * @param "firstLeg" The variable for one of the two numbers that is checked
 * @param "secondLeg" The variable for the other number that is checked
 * @return true/ false is what is returned depending on whether or not each number is a perfect square
 */
	public static boolean isSquare(int firstLeg, int secondLeg) {
		int srt = (int) Math.sqrt(firstLeg);
		int srt2 = (int) Math.sqrt(secondLeg);
		double check2 = Math.pow(srt2, 2);
		double check = Math.pow(srt, 2);
		if (firstLeg == check) {
			return true;
		}
		if (secondLeg == check2) {
			return true;
		}
		return false;
	}
}
