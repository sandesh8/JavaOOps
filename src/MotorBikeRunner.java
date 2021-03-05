
public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike Honda = new MotorBike();
		Honda.Start();
		Honda.Stop();
		Honda.setSpeed(200);
		Honda.setPrice(200000);
	    Honda.increaseSpeed(290);
        Honda.decreaseSpeed(100);
	}

}
