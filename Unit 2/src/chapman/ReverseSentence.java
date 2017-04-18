package chapman;

import java.util.Scanner;
/**
 * ReverseSentence.java
 * The program  prints out an inputed sentence backwards, this includes capital letters.
 * April 13 2017
 * @author Roger Chapman
 */

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		for (int i = 0; i < sentence.length; i++) {

			for (int j = sentence[i].length() - 1; j >= 0; j--) {
				if (((Character) (sentence[i].charAt(0))).toString().matches("[A-Z]")) {
					if (j == sentence[i].length() - 1) {
						System.out.print(Character.toUpperCase(sentence[i].charAt(j)));
					} 
					else {
						System.out.print(Character.toLowerCase(sentence[i].charAt(j)));
					}
				} 
				else {
					System.out.print(sentence[i].charAt(j));
				}
				
			}
			System.out.print(" ");
			}
			

		}

	}
