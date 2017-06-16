import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;
/**
 * 
 * @author Roger Chapman
 * Behavior to determine whether or not the bottle is light or dark and actions depending on that
 * June 16 2017
 */
public class PickUpPushDown implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor bottle;
	private LightSensor light;
	public PickUpPushDown(UltrasonicSensor us, LightSensor ls){
		this.bottle = us;
		this.light = ls;
	}
	/**
	 * Checks how close the robot is to the bottle
	 * @param bottle Takes control if the distance to the bottle is less than 24 cm
	 * @return True/false depending on whether or not the bottle is close enough
	 */
	public boolean takeControl(){
		if(bottle.getDistance() < 24){
			return true;
		}
		return false;
	}
	/**
	 * Motors stop and depending on the light value, the bottle is either picked up and driven to the base or pushed off the table
	 * @param light The actions that occur depend on the value of the light
	 */
	public void action(){
		suppressed = false;
		Motor.A.stop();
		Motor.B.stop();
		Delay.msDelay(500);
		System.out.println(light.getLightValue());
		if(light.getLightValue() <50 && light.getLightValue() >39){
			Motor.C.rotate(-90);
			Motor.A.rotate(90,true);
			Motor.B.rotate(-90);
			Motor.A.rotate(90,true);
			Motor.B.rotate(90);
			
		}
		else if(light.getLightValue() >50){
			Motor.C.rotate(-90);
			Motor.A.backward();
			Motor.B.backward();
		}
		 
	}
	/**
	 * Stops the action taking place
	 */
	public void suppress(){
		suppressed = true;
	}

}
