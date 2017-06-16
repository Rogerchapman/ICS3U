import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

/**
 * 
 * @author Roger Chapman
 * Behavior for when the robot touches the base
 * June 16 2017
 *
 */
public class TouchBase implements Behavior{
	private boolean suppressed = false;
	private TouchSensor touch;
	public TouchBase(TouchSensor t){//Takes over if the touch sensor is pressed
		this.touch = t;
	}
	
	/**
	 * @param touch takes control if the touch sensor is pressed
	 * @return returns true/false depending on whether or not the touch sensor is pressed
	 */
	public boolean takeControl(){
		if(touch.isPressed()){
			return true;
		}
		return false;
	}
	
	/**
	 * Goes forward so it can turn, turns, releases the bottle, returns to position so it can get the next bottle
	 * 
	 */
	public void action(){
		Motor.A.rotate(360,true);
		Motor.B.rotate(360);
		Motor.A.rotate(180,true);
		Motor.B.rotate(-180);
		Motor.C.rotate(-90);
		Motor.A.rotate(-360,true);
		Motor.B.rotate(-360);
		Motor.A.rotate(-180,true);
		Motor.B.rotate(180);
	}
	
	/**
	 * Stops the action
	 */
	public void suppress(){
		suppressed = true;
	}
	

}
