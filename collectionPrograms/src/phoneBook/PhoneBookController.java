package phoneBook;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PhoneBookController {

	TreeSet<Contact> phoneBook = new TreeSet();
	Scanner scan  = new Scanner(System.in);
	
	public void addContact()
	{
		System.out.println("Enter the Name");
		String name = scan.nextLine();
		System.out.println("Enter the  Phone Number");
		long phoneNumber = scan.nextLong();
		phoneBook.add(new Contact(name, phoneNumber));
		System.out.println("Contact added successfully...!");
	}
	
	public void removeContact()
	{
		if(phoneBook.size() > 0)
		{
			System.out.println("Enter the Name to be removed");
			String name = scan.nextLine();
			Iterator<Contact> it = phoneBook.iterator();
			while(it.hasNext())
			{
				if(it.next().name.equalsIgnoreCase(name))
				{
					it.remove();
					System.out.println("Contact removed Successfully...!");
				}
			}
		}
		else
			System.out.println("Phone Book is Empty Contact can't be removed...!");
	}
	
	public void searchContact()
	{
		if(phoneBook.size() > 0)
		{
			System.out.println("Enter the name to search the contact");
			String name = scan.nextLine();
			boolean found = false;
			for(Contact con : phoneBook)
			{
				if(con.name.equals(name))
				{
					found = true;
					System.out.println("Contact found...!");
					System.out.println(con);
					break;
				}
			}
			if(found == false)
			System.out.println("Contact not found...!");
		}
		else
			System.out.println("Phone Book is Empty nothing found to search...!");
	}
	
	public void editContact()
	{
		if(phoneBook.size() > 0)
		{
			System.out.println("Enter the name to edit the contact...!");
			String name = scan.nextLine();
			Iterator<Contact> it = phoneBook.iterator();
			boolean found = false;
			while(it.hasNext())
			{
				Contact c = it.next();
				if(c.name.equalsIgnoreCase(name))
				{
					found = true;
					it.remove();
					addContact();
//					System.out.println("Enter the Name");
//					c.name = scan.nextLine();
//					System.out.println("Enter the  Phone Number");
//					c.phoneNumber = scan.nextLong();
//					System.out.println("Contact is edited successfully...!");
					break;
				}
			}
			if(found == false)
				System.out.println("Contact not found...!");
		}
		else
			System.out.println("Phone Book is Empty can't be edited...!");
	}
	
	public void displayContact()
	{
		System.out.println(phoneBook);
	}
}
