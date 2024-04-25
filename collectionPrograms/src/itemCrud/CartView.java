package itemCrud;

import java.util.Scanner;

public class CartView {
	
	static ItemController ic = new ItemController();
	public static void main(String[] args) {
		System.out.println("*** Welcome to Cart Application ***");
		System.out.println();
		while(true)
		{
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Search Item");
			System.out.println("4. total price of cart");
			System.out.println("5. Display cart");
			System.out.println("6. Exit");
			System.out.println("Enter your choice...!");
			int choice = ic.items.scan.nextInt();
			ic.items.scan.nextLine();
			switch(choice)
			{
			case 1:
					ic.add();
					break;
					
			case 2:
					ic.remove();
					break;
					
			case 3:
					ic.search();
					break;
					
			case 4:
					ic.totalPrice();
					break;
					
			case 5:
					ic.displayCart();
					break;
					
			case 6: System.out.println( "Thank You...!");
					return;
					
			default : System.out.println("Invalid choice...!");
			}
		}
	}
}
