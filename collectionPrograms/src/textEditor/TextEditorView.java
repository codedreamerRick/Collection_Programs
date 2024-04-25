 package textEditor;

public class TextEditorView {

	public static void main(String[] args) {
		TextEditorController tec = new TextEditorController();
		while(true)
		{
			System.out.println("1. Save");
			System.out.println("2. Undo");
			System.out.println("3. Redo");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			
			int c = tec.scan.nextInt();
			tec.scan.nextLine();
			
			switch(c)
			{
			case 1: tec.save();
					break;
				
			case 2:	tec.undo();
					break;
					
			case 3:	tec.redo();
					break;
					
			case 4: tec.disp();
					break;
					
			case 5: return;
			
			default : System.out.println("Enter the valid choice...!");
			}
		}
	}
}
