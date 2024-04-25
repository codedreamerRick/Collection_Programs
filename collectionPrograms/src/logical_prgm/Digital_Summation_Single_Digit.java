package logical_prgm;

import java.util.Scanner;

public class Digital_Summation_Single_Digit {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...!!!");
		int n = s.nextInt();
		while(n > 9)
		{
			int sum = 0;
			while(n != 0)
			{
				sum += n % 10;
				n /= 10;
			}
			n = sum;
		}
		System.out.println("Digital summation : "+n);
	}
}
