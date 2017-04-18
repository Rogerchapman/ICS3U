/**
 * 
 */
package chapman;

import java.util.Scanner;

/**
 * TakeANumber.java
 * April 18, 2017
 * The program asks the user to enter the slip number and then enter one of a few options then it prints values based on this each time the user enters close
 * @author Roger Chapman, Wayne Chau, Ahmed Addo
 *
 */
public class TakeANumber {
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current slip number (Between 1 - 999)");
		int slipNumber = sc.nextInt();
		while (!(slipNumber>0&&slipNumber<100)){
			System.out.println("Please follow instructions, try again.");
			slipNumber = sc.nextInt();
		}
		System.out.println("Enter current activity ('TAKE' 'SERVE' 'CLOSE' \nWhen there is no more activity enter 'EOF')");
		String activity = sc.nextLine();
		int waitNumber = 0;
		int latePeople = 0;
		while (!activity.equalsIgnoreCase("EOF")) {
			activity = sc.nextLine();
			if (activity.equalsIgnoreCase("TAKE")) {
				slipNumber++;
				waitNumber++;
				latePeople++;
			}
			if (activity.equalsIgnoreCase("SERVE")) {
				waitNumber--;
			}
			if (activity.equalsIgnoreCase("CLOSE")) {
				System.out.println(latePeople + " " + waitNumber + " " + slipNumber);
				latePeople=0;
			}
		}

	}

}
