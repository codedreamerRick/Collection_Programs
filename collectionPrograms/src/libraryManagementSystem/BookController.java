package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {

	private ArrayList<Book> books = new ArrayList();
	private Scanner scan = new Scanner(System.in);
	
	public void addBook()
	{
		System.out.println("Enter the Title of the Book");
		String title = scan.nextLine();
		if(title.length() <= 0)
		{
			title=scan.nextLine();
		}
		System.out.println("Enter the Author name");
		String author = scan.nextLine();
		System.out.println("Enter the id of the Book");
		String id = scan.next();
		Book book = new Book(title, author, id, true);
		books.add(book);
		System.out.println("Book is successfully added to the library"); 
	}
	
	public void searchBook()
	{
		System.out.println("Enter the Title or Author or id to search a book");
		String str = scan.nextLine();
		if(str.length() <= 0)
		{
			str=scan.nextLine();
		}
		boolean found = false;
		for(Book book : books)
		{
			if(book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str) || book.getId().equalsIgnoreCase(str))
			{
				System.out.println("Book is found");
				System.out.println(book);
				found = true;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("Book is not found in the library");
		}
	}
	
	public void borrowBook()
	{
		System.out.println("Enter the Title or Author or id to borrow a book");
		String str = scan.nextLine();
		if(str.length() <= 0)
		{
			str=scan.nextLine();
		}
		boolean found = false;
		for(Book book : books)
		{
			if((book.getAvailable()) && ((book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str) || book.getId().equalsIgnoreCase(str))))
			{
				book.setAvailable(false);
				System.out.println("Book successfully borrowed");
				found = true;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("Book is not available for borrowing...!!!");
		}
	}
	
	public void returnBook()
	{
		System.out.println("Enter the Title or Author or id to return a book");
		String str = scan.nextLine();
		if(str.length() <= 0)
		{
			str=scan.nextLine();
		}
		boolean found = false;
		for(Book book : books)
		{
			if(( ! book.getAvailable()) && ((book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str) || book.getId().equalsIgnoreCase(str))))
			{
				book.setAvailable(true);
				System.out.println("Book successfully returned...!");
				found = true;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("Book is not found or not borrowed...!!!");
		}
	}
	
	public void removeBook()
	{
		System.out.println("Enter the Title or Author or id to return a book");
		String str = scan.nextLine();
		if(str.length() <= 0)
		{
			str=scan.nextLine();
		}
		boolean found = false;
		for(int i = 0; i <books.size(); i++)
		{
			Book book = books.get(i);
			if((book.getAvailable()) && ((book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str) || book.getId().equalsIgnoreCase(str))))
			{
				books.remove(i);
				System.out.println("Book successfully removed...!");
				found = true;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("Book is not found in the library...!!!");
		}
	}
}
