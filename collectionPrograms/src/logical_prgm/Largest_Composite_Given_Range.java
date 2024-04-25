package logical_prgm;

import java.util.Scanner;

public class Largest_Composite_Given_Range {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting range...!!!");
		int start = s.nextInt();
		System.out.println("Enter the ending range...!!!");
		int end = s.nextInt();
		int maxComposite = 0;
		for (int i = start; i <= end; i++) 
		{
			int count = 0;
			for (int j = 1; j <= i; j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count != 2)
			{
				if(i > maxComposite)
				{
					maxComposite = i;
				}
			}
		}
		System.out.println("Largest composite number in given range : "+maxComposite);
	}
}
