package vehicle_mani;

public class Bike extends Manufacture implements Vehicle {

	public Bike(String name, String modelName, String brandName)
	{
		super(name,modelName,brandName);
	}
	
	public void maxSpeed(int speed)
	{
		System.out.println("Max speed is : "+speed);
	}
}
