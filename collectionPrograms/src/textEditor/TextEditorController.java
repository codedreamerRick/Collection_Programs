package textEditor;

import java.util.LinkedList;
import java.util.Scanner;

public class TextEditorController {

	LinkedList<String> textList = new LinkedList<>();
	Scanner scan = new Scanner(System.in);
	int pos = -1;
	
	public void save()
	{
		System.out.println("Enter the text...!");
		String text = scan.nextLine();
		
//		while(pos < textList.size() - 1)
//		{
//			textList.removeLast();
//		}
		
		textList.add(text);
		pos++;
	}
	
	public void undo()
	{
		if(pos > -1)
		{
			pos--;
		}
		else
			System.out.println("No further text to be undo");
	}
	
	public void redo()
	{
		if(pos < textList.size() - 1)
		{
			pos++;
		}
		else
			System.out.println("No further text to be redo");
	}
	
	public void disp()
	{
		for(int i = 0; pos >= 0 &&i <= pos; i++)
		{
			System.out.print(textList.get(i)+" ");
		}
		System.out.println();
	}
}
