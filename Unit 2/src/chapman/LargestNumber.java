package chapman;

import java.util.Scanner;
/**
 * LargestNumber.java
 * The program finds the largest number out of the set of numbers entered by the user and outputs it.
 * April 4 2017
 * @author Roger Chapman
 */

public class LargestNumber {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of integers you wish to enter");
		int userAmount = s.nextInt();
		int[] userNumbers = new int[userAmount];
		for(int i=0; i<userAmount; i++){
			userNumbers[i] = s.nextInt();
		}
		int y = largestNumber(userNumbers);
		System.out.println(y);
	}
	public static int largestNumber(int[]userNumbers){
		/**
		 * The method compares the largest value in the array so far to the current number in the array until all numbers in the array have been compared. It then returns the largest one.
		 * @param "userNumbers" This is the array which holds each number that the user enters so that they can be compared later
		 * @return "maxNum" This is the largest number out of those entered by the user after the comparison
		 */
		int maxNum = userNumbers[0];
		for(int i =1; i<userNumbers.length; i++){
			maxNum = Math.max(maxNum, userNumbers[i]);
		}
		return maxNum;
	}

}
