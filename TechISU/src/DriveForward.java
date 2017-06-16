import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

/**
 * 
 * @author Roger Chapman
 * The robot drives forward when a button is pressed
 *June 16 2017
 */
public class DriveForward implements Behavior {
	private boolean suppressed = false;
	public boolean takeControl(){
		return true;
	}
	/**
	 * Robot goes forward
	 */
	public void action(){
		suppressed = false;
		Button.waitForAnyPress();
		Motor.A.forward();
		Motor.B.forward();
		while(!suppressed)
			Thread.yield();
		
	}
	/**
	 * Stops the action
	 */
	public void suppress(){
		suppressed = true;
	}
}
