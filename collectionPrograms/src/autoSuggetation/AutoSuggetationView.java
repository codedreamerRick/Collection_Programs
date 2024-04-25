package autoSuggetation;

public class AutoSuggetationView {

	public static void main(String[] args) {
		AutoSuggetationController a = new AutoSuggetationController();
		while(true)
		{
			System.out.println("1. Add");
			System.out.println("2. Suggetation");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			int c = a.scan.nextInt();
			a.scan.nextLine();
			
			switch(c)
			{
			case 1: a.addToDictionary();
					break;
				
			case 2:	a.suggetation();
					break;
					
			case 3: System.out.println("Thank You...!");
					return;
			
			default : System.out.println("Enter the valid choice...!");
			}
		}
	}
}
