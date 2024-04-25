package phoneBook;

public class PhoneBookView {

	public static void main(String[] args) {
		PhoneBookController pb = new PhoneBookController();
		System.out.println("*** Welcome to Phone Book Application ***");
		
		while(true)
		{
			System.out.println("1. Add Contact\n2. Remove Contact\n3. Edit Contact\n4. Search Contact\n5. Display Contacts\n6. Exit");
			System.out.println("Enter your choice...!");
			int choice = pb.scan.nextInt();
			pb.scan.nextLine();
			
			switch(choice)
			{
			case 1:
					pb.addContact();
					break;
					
			case 2:
					pb.removeContact();
					break;
					
			case 3:
					pb.editContact();
					break;
					
			case 4:
					pb.searchContact();
					break;
					
			case 5:
					pb.displayContact();
					break;
					
			case 6: return;
			
			default : System.out.println("Invalid choice...!");
			}
		}
	}
}
