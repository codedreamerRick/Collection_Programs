package logical_prgm;

import java.util.Scanner;

public class Nth_Prime_Number {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting range...!!!");
		int start = s.nextInt();
		System.out.println("Enter the ending range...!!!");
		int end = s.nextInt();
		System.out.println("Enter the position of required prime number");
		int pos = s.nextInt();
		if(pos > 0)
		{
			int count = 0;
			for (int i = start; i <= end; i++) 
			{
				int c = 0;
					for (int j = 1; j <= i; j++) 
					{
						if(i % j == 0)
						{
							c++;
						}
					}
				if(c == 2)
				{
					count++;
					if(pos == count)
					{
						System.out.println(i+" is the "+pos+"th prime number");
						System.exit(0);
					}
				}
			}
			if(pos > count && count != 0)
			{
				System.out.println("You have only "+count+" prime numbers");
				System.out.println("Give the position in between 1 to "+count);
			}
			else if(count == 0)
			{
				System.out.println("No prime numbers are present in given range");
			}
		}
		else
		{
			System.out.println("Position should be always positive...!!!");
		}
	}
}
