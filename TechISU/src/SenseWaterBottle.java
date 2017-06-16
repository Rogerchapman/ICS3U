
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
public class SenseWaterBottle implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor bottle = new UltrasonicSensor(SensorPort.S3);
	public boolean takeControl(){
		if(bottle.getDistance()<25){
			return true;
		}
		return false;
	}
	public void action(){
		Motor.A.forward();
		Motor.B.forward();
		Thread.yield();
	}
	public void suppress(){
		suppressed = true;
	}
	
}
