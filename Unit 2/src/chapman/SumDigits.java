package chapman;

import java.util.Scanner;
/**
 * SumDigits.java
 * The program calculates the sum of the digits of a number entered by the user and outputs it.
 * April 4 2017
 * @author Roger Chapman
 */

public class SumDigits {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int sum = s.nextInt();
		int x = sumDigits(sum);
		System.out.println(x);
	}
	/**
	 * This method calculates the sum of the digits entered by the user
	 * @param "num" This is the number that is entered by the user
	 * @return "sum" This is the sum of the digits from the number that was entered by the user
	 */
	public static int sumDigits(int num){
		
		int sum = 0;
		while(num>=1){
			sum = sum+num%10;
			num = num/10;
		}
		return sum;
	}

}
