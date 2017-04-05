package chapman;

import java.util.Scanner;
/**
 * IsPrime.java
 * The program determines whether or not the number entered by the user is prime or not and outputs "true" or "false" respectively
 * April 4 2017
 * @author Roger Chapman
 */

public class IsPrime {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = s.nextInt();
		boolean z = isPrime(number);
		System.out.println(z);
	}
	public static boolean isPrime(int number){
		/**
		 * The method determines whether or not the number entered is prime or not by dividing it by every number that is less than or equal to half of itself and then returns true or false.
		 * @param "number" This is the number that is entered by the user.
		 * @return true/false is what is returned depending on whether or not the number entered is prime.
		 */
		for (int i=2; i<=number/2; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
}
