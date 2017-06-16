
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
 * 
 */

/**
 * @author Roger Chapman
 * The arbitrator which combines the behaviors
 * June 16 2017
 *
 */
public class Arbit {

	/**
	 * All of the behavior listed in order of priority
	 */
	public static void main(String[] args){
		
	UltrasonicSensor bottle = new UltrasonicSensor(SensorPort.S3);
	LightSensor light = new LightSensor(SensorPort.S1);
	TouchSensor touch = new TouchSensor(SensorPort.S4);
		
	Behavior b1 = new Stop();
	Behavior b2 = new DriveForward();
	Behavior b3 = new PickUpPushDown(bottle, light);
	Behavior b4 = new TouchBase(touch);
	Behavior[] behaviours = {b2,b3,b4, b1};
	Arbitrator arby = new Arbitrator(behaviours);
	arby.start();
	

	}

}
