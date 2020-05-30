package Main;

public class Test {

		
	private static  String SensorPort ;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
		SoundSensor ss = new SoundSensor(SensorPort);
				
		pilot.setTravelSpeed(15);
		
		pilot.forward();
		Thread.sleep(2000);
		
		pilot.rotate(60);
		
		
		pilot.setTravelSpeed(90);
		
		pilot.backward(3000);
		Thread.sleep(3000);
		
		pilot.rotate(-90);
				
		while (ss.readValue() > 90) {pilot.rotate(90) ;
		
		Thread.sleep(2000);

		}
	}
	
}