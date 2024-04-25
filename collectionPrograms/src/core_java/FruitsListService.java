package core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitsListService {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the names of fruits you want to add");
		String s1 = s.nextLine();
		String [] s2 = s1.split(",");
		ArrayList a2 = addFruitsToList(s2);
		System.out.println(a2);
		System.out.println("Enter the fruit you want to search");
		String f = s.next();
		System.out.println(f+" is present at index "+searchFruitInList(a2, f));
		System.out.println(f+" is present at index "+searchFruitInListIgnoreCase(a2, f));
	}
	static ArrayList <String> a1 = new ArrayList();
	
//								add into list
	
	public static ArrayList addFruitsToList(String [] fruit)
	{
		for (int i = 0; i < fruit.length; i++) 
		{
			int count = 0;
			for(String s1 : a1)
			{
				if(s1.equalsIgnoreCase(fruit[i]))
				{
					count++;
				}
			}
			if(count == 0)
			{
				a1.add(fruit[i]);
			}
		}
		return a1;
	}
	
//								case sensitive
	
	public static int searchFruitInList(ArrayList <String> a1, String fruit)
	{
			if(a1.contains(fruit))
			{
				return a1.indexOf(fruit);
			}
			else
			{
				return -1;
			}
	}
	
//								case insensitive
	
	public static int searchFruitInListIgnoreCase(ArrayList <String> a1, String fruit)
	{
			for(String s1 : a1)
			{
				if(s1.toLowerCase().equals(fruit.toLowerCase()))
				{				
					return a1.indexOf(s1);
				}
			}
			return -1;
	}
}
