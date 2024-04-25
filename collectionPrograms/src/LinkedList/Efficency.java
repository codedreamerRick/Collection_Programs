package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Efficency 
{
	public static void main(String[] args) 
	{
		ArrayList arr = new ArrayList();
		long start = System.nanoTime();
		for (int i = 1; i <= 100000; i++) 
		{
			arr.add(i);
		}
		long end = System.nanoTime();
		System.out.println("Duration : "+(end-start));
		
		LinkedList ll = new LinkedList();
		long start1 = System.nanoTime(); 
		for (int i = 1; i <= 100000; i++) 
		{
			ll.add(i);
		}
		long end1 = System.nanoTime();
		System.out.println("Duration : "+(end1-start1));
	}
}
