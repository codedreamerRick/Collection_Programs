package vehicle_mani;

import java.util.Scanner;
public class VehicleService {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("======= Welcome to Vehicle Showroom =======");
		System.out.println("Car");
		System.out.println("Bike");
		System.out.println("Enter Vehicle");
		String name = s.next();
		Vehicle v = VehicleFactory.getVehicle(name);
		Manufacture m = (Manufacture)v;
		System.out.println(m.getManufactureInfo());
		v.maxSpeed(200);
		}
}
