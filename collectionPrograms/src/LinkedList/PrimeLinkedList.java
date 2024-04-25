package LinkedList;

import java.util.LinkedList;

public class PrimeLinkedList {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(23);
		ll.add(24);
		ll.add(25);
		ll.add(26);
		ll.add(27);
		ll.add(28);
		ll.add(29);
		ll.add(30);
		ll.add(31);
		for(Object o : ll)
		{
			int a = (int) o;
			int count = 0;
			for (int i = 1; i <= a; i++) 
			{
				if(a % i == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(a+" ");
			}
		}
	}
}
