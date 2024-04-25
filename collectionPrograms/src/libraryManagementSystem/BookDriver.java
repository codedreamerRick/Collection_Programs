package libraryManagementSystem;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to Library Management System...!!!");
		BookController b = new BookController();
		int choice = 0;
		while(true)
		{
			System.out.println("1. Add Book");
			System.out.println("2. Search Book");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Remove Book");
			System.out.println("6. Exit");
			System.out.println("Enter the choice");
			choice  = new Scanner(System.in).nextInt();
			switch(choice)
			{
			case 1:
				b.addBook();
				break;
			case 2:
				b.searchBook();
				break;
			case 3:
				b.borrowBook();
				break;
			case 4:
				b.returnBook();
				break;
			case 5:
				b.removeBook();
				break;
			case 6:
				return;
			default: System.err.println("Enetr the valid choice...!!!");
			}
		
		}
	}
}
