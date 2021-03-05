
public class FanModelling {
	
		String make;
		int radius;
		String color;
		boolean isOn;
		int speed;
		
	public FanModelling(String make, int radius, String color)
	{
		this.make = make;
		this.radius = radius;
		this.color = color;
		System.out.println(this.make);
		System.out.println(this.color);
		System.out.println(this.radius);
	}
    public void isOn(boolean isOn)
    {
    	this.isOn = isOn;
    	System.out.println(this.isOn);
    }
	public void switchOn()
	{
		this.isOn = true;
		System.out.println(this.isOn);
	}
	public void switchOff()
	{
		this.isOn = false;
		System.out.println(this.isOn);
	}
	public void Speed(int speed)
	{
		this.speed = speed;
		System.out.println(this.speed);
	}
	public static void main(String[] args)
	{

    FanModelling fan = new FanModelling("Manufacturer1", 19, "Blue");
    fan.switchOn();
    fan.isOn(true);
    fan.switchOff();
    fan.Speed(5);
    
	}

}
