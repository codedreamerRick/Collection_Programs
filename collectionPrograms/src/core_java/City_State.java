package core_java;

import java.util.Scanner;
import java.util.TreeMap;

public class City_State {

	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		TreeMap <String, String> t = new TreeMap <String, String> ();
		t.put("Bangalore", "Karnataka");
		t.put("Chennai", "Tamilnadu");
		t.put("Kolkata", "West Bengal");
		t.put("Mumbai", "Maharastra");
		System.out.println("======= Welcome to State =======");
		System.out.println("Bangalore");
		System.out.println("Chennai");
		System.out.println("Kolkata");
		System.out.println("Mumbai");
		String choice = s.next().toLowerCase();
		switch(choice)
		{
		case "bangalore":
		{
			System.out.println("State : "+t.get("Bangalore"));
		}
		break;
		case "chennai":
		{
			System.out.println("State : "+t.get("Chennai"));
		}
		break;
		case "kolkata":
		{
			System.out.println("State : "+t.get("Kolkata"));
		}
		break;
		case "mumbai":
		{
			System.out.println("State : "+t.get("Mumbai"));
		}
		break;
		default:
			System.out.println("City is not in the list...!!!");
		}
	}
}
