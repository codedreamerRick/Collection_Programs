package logical_prgm;

import java.util.Scanner;

public class Highest_Factor_Of_Digit {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...!!!");
		int n = s.nextInt();
		int highestFactor = 0;
		int largestUnitDigit = 0;
		while(n > 0)
		{
			int unitDigit = n % 10;
			int count = 0;
			for (int i = 1; i <= unitDigit; i++) 
			{
				if(unitDigit % i == 0)
				{
					count++;
				}
			}
			if(count > highestFactor)
			{
				highestFactor = count;
				largestUnitDigit = unitDigit;
			}
			n /= 10;
		}
		System.out.println("The digit whose factor is highest : "+largestUnitDigit);
	}
}
