package itemCrud;

import java.util.HashSet;
import java.util.Scanner;

public class Item {

	String name;
	Double price;
	
	Scanner scan = new Scanner(System.in);
	
	public Item()
	{
		
	}
	
	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Item)obj).name);
	}
	
	HashSet<Item> cart = new HashSet<>();
	
	@Override
	public String toString() {
		return "\n"+name+" : "+price;
	}
}
