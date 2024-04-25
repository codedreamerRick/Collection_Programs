package vehicle_mani;

public class VehicleFactory {

	public static Vehicle getVehicle(String name)
	{
		if(name.equalsIgnoreCase("Car")) 
		{
			return new Car("Car", "Seltos", "KIA");
		}
		else if(name.equalsIgnoreCase("Bike"))
		{
			return new Bike("Bike", "Adventure", "Yezdi");
		}
		else
		{
			System.out.println("Invalid option...!!!");
		}
		return null;
	}
}
