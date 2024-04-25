package autoSuggetation;

import java.util.LinkedList;
import java.util.Scanner;

public class AutoSuggetationController {

	LinkedList<String> dictionary = new LinkedList<>();
	Scanner scan = new Scanner(System.in);
	
	public void addToDictionary()
	{
		System.out.println("Enter exit to stop adding...!");
		System.out.println("Enter the text to be added in dictionary...!");
		String text = "";
		while(!text.equals("exit"))
		{
			text = scan.next().toLowerCase();
			dictionary.add(text);
		}
		System.out.println("Words successfully added...!");
	}
	
	public void suggetation()
	{
		System.out.println("Enter the prefix to search...!");
		String prefix = scan.next().toLowerCase();
		System.out.println("Suggetation related to "+prefix+"...!");
		for(String str : dictionary)
		{
			if(str.startsWith(prefix))
			{
				System.out.println(str+" ");
			}
		}
	}
}
