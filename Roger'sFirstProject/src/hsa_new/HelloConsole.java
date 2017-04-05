/**
 * 
 */
package hsa_new;
import hsa_new.Console;
/**
 * HelloConsole.java
 * This program
 * February 24, 2017
 * @author Roger Chapman
 */
public class HelloConsole {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console c = new Console(32,80);
		int hsRank;
		int bestHsRank;
		c.println("Please enter your hearthstone rank from last season.");
		hsRank = c.readInt();
		c.println("Pease enter the best hearthstone rank that you have achieved.");
		bestHsRank = c.readInt();
		if (bestHsRank <= 5);
		{
			c.println("You are a scrub.");
		}
		else
		{
			c.println("You are an MLG pro!");
		}
	}

}