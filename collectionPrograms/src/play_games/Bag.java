package play_games;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bag {

	public static void main(String[] args) 
	{
		int a = 10;
		Scanner s = new Scanner(System.in);
		System.out.println("1. Tennis");
		System.out.println("2. Football");
		System.out.println("3. Cricket");
		System.out.println("Enter your choice");
		int choice = s.nextInt();
		switch(choice)
		{
			case 1:
			{
				Ball b = new Tennis("Tennis");
				System.out.println("Welcome to "+displayGame(b)+"...!!!");
				System.out.println("=====Rules=====");
				b.rulesToPlay();
			}
			break;
			case 2:
			{
				Ball b = new Football("Football");
				System.out.println("Welcome to "+displayGame(b)+"...!!!");
				System.out.println("=====Rules=====");
				b.rulesToPlay();
			}
			break;
			case 3:
			{
				Ball b = new Cricket("Cricket");
				System.out.println("Welcome to "+displayGame(b)+"...!!!");
				System.out.println("=====Rules=====");
				b.rulesToPlay();
			}
			break;
			default:System.out.println("Invalid option...!!!");
		}
		
	}
	static String displayGame(Ball b)
	{
		if(b instanceof Tennis)
		{
			return ((Tennis)b).getGame();
		}
		else if(b instanceof Football)
		{
			return ((Football)b).getGame();
		}
		else if(b instanceof Cricket)
		{
			return ((Cricket)b).getGame();
		}
		return null;
	}
}
