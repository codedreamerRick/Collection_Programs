package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Driver1{
	
	public static void main(String[] args) {
		
		
		int [] arr = new int [3];
		Scanner sc = new Scanner(System.in);
		display(arr, sc);
		sc.close();
		Scanner sc1 = new Scanner(System.in);
		display(arr, sc1);
		sc1.close();
	}
	
	static void display(int [] a, Scanner sc)
	{
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
//		sc.close();
	}

}



