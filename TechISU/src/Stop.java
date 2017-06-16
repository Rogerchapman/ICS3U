import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;
/**
 * 
 * @author Roger Chapman
 * Ends the program when the button is pressed
 * June 16 2017
 */
public class Stop implements Behavior {
/**
 * Takes control if the button is pressed
 */
	public boolean takeControl(){
		return Button.ESCAPE.isDown();
	}
	/**
	 * Ends the program
	 */
	public void action(){
		System.exit(0);
		
	}
	public void suppress(){
		
	}
}
