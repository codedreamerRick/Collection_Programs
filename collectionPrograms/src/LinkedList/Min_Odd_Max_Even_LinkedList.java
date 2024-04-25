package LinkedList;
import java.util.LinkedList;

public class Min_Odd_Max_Even_LinkedList {

	public static void main(String[] args) 
	{
		int min_odd = Integer.MAX_VALUE;
		int max_even = Integer.MIN_VALUE;
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(8);
		ll.add(6);
		ll.add(9);
		ll.add(4);
		ll.add(11);
		System.out.println(ll);
		for(Object o : ll)
		{
			int a = (int) o;
			if(a % 2 != 0 && a < min_odd)
			{
					min_odd = a;
			}
			if(a % 2 == 0 && a > max_even)
			{
					max_even = a;
			}
		}
		System.out.println("Min Odd : "+min_odd);
		System.out.println("Max Even : "+max_even);
		int sum = min_odd + max_even;
		System.out.println("The sum of minimum odd number and the maximum even number : "+sum);
	}
}
