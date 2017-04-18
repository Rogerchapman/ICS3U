
package chapman;

import java.util.Scanner;

/**
 * RopeUnfolding.java
 * April 18 2017
 * The program takes lines entered by the user, starting at the last one and prints them forwards and then backwards in alternating order, combining them on one line a.k.a It unfolds Ropes
 * @author Roger Chapman, Ahmed Addo, Wayne Chau
 */
public class RopeUnfolding {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount of lines that you wish to type your reverse word in");

		int numLines = sc.nextInt() + 1;

		String characters[] = new String[numLines];

		for (int i = 0; i < characters.length; i++) {
			characters[i] = sc.nextLine().trim();
		}

		boolean alternate = true;
		for (int x = numLines - 1; x > 0; x--) {
			if (!alternate) {
				System.out.print(reverseString(characters[x]));
			} else {
				System.out.print(characters[x]);
			}

			alternate = !alternate;
		}

	}
/**
 * This method takes a word and reverses it
 * @param s - word that will be reversed
 * @return reversed - Returns the reversed word
 */
	public static String reverseString(String s) {

		String reversed = "";

		for (int j = s.length() - 1; j >= 0; j--) {
			reversed += s.charAt(j);
		}
		return reversed;
	}
}
