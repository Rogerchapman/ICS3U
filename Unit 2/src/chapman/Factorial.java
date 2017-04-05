/**
 * 
 */
package chapman;

import java.util.Scanner;

/**
 * Factorial.java
 * The program finds the factorial of a number entered by the user.
 * April 4 2017
 * @author Roger Chapman
 */
public class Factorial {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		double number = s.nextDouble();
		double z = factorial(number);
		System.out.println(z);
	}
	/**
	 * The method calculates the factorial of the number entered unless that number is less than or equal to zero.
	 * @param "x" This is the number entered by the user which will be used when calculating the factorial.
	 * @return "x" This is the new value of the number entered by the user after the factorial of it has been found.
	 */
	public static double factorial(double x){
		
		if(x<0){
			return -1;
		}
		else if(x==0){
			return 1;
		}
		else{
			for (double y=x-1; y>0;y--){
				x=x*y;
			}
			return x;
		}
	}

	
}
