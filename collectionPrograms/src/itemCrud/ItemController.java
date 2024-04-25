package itemCrud;

import java.util.Scanner;

public class ItemController {

	Item items = new Item();
	
	public void add()
	{
		System.out.println("Enter the Item name");
		String name = items.scan.nextLine();
		System.out.println("Enter the Item price");
		double price = items.scan.nextDouble();
		boolean check = false;
		for(Item i : items.cart)
		{
			if(i.name.equalsIgnoreCase(name))
			{
				System.out.println("Item is already exist in Cart...!");
				check = true;
				break;
			}
		}
		if(check == false)
		{
			items.cart.add(new Item(name,price));
			System.out.println("Item is added to Cart...!"); 
		}
	}
	
	public void remove()
	{
		if(items.cart.size() != 0)
		{
			System.out.println("Enter the Item to be removed");
			String name = items.scan.nextLine();
			Item i = null;
			for(Item i1 : items.cart)
			{
				if(i1.name.equalsIgnoreCase(name))
				{
					i = i1;
					break;
				}
			}
			items.cart.remove(i);
			System.out.println("Item is removed successfully...!");
		}
		else
			System.out.println("Cart is empty...!");
	}
	
	public void search()
	{
		if(items.cart.size() != 0)
		{
			System.out.println("Enter the item name to be searched");
			String name = items.scan.nextLine();
			boolean check = false;
			for(Item i : items.cart)
			{
				if(i.name.equalsIgnoreCase(name))
				{
					System.out.println(items.cart );
					check = true;
					break;
				}
			}
			if(check == false)
			{
				System.out.println("Item is not found...!");
			}
		}
		else
			System.out.println("Cart is empty...!");
	}
	
	public void totalPrice()
	{
		if(items.cart.size() != 0)
		{
			double sum = 0;
			for(Item i : items.cart)
			{
				sum += i.price;
			}
			System.out.println("Total Payable Amount : "+sum);
		}
		else
			System.out.println("Cart is empty...!");
	}
	
	public void displayCart()
	{
		if(items.cart.size() != 0)
		{
			if(items.cart.size() > 0)
				System.out.println(items.cart);
			else
				System.out.println("Cart is Empty...!");
		}
		else
			System.out.println("Cart is empty...!");
	}
}
