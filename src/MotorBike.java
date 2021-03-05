
public class MotorBike {
	private int speed;
	private int price;
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
		System.out.println(speed);
		System.out.println(this.speed);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
		System.out.println(price);
		System.out.println(this.price);
	}
	
	public void increaseSpeed(int increase)
	{
		this.speed = this.speed + increase;
		System.out.println(this.speed);
	}
	
	public void decreaseSpeed(int decrease)
	{
		this.speed = this.speed - decrease;
		System.out.println(this.speed);
	}
	
	
	public void Start()
	{
		System.out.println("Bike Started\n");
	}
	
    public void Stop()
    {
    	System.out.println("Bike Started\n");
    }
    
}
