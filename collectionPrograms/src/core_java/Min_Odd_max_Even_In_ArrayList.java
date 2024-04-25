package core_java;

import java.util.ArrayList;

public class Min_Odd_max_Even_In_ArrayList {

	public static void main(String[] args) 
	{
		int min_odd = Integer.MAX_VALUE;
		int max_even = Integer.MIN_VALUE;
		ArrayList a1 = new ArrayList();
		a1.add(-1);
		a1.add(2);
		a1.add(-33);
		a1.add(48);
		a1.add(5);
		a1.add(68);
		a1.add(-34);
		a1.add(8);
		System.out.println(a1);
		for(Object o : a1)
		{
			int a = (int) o;
			if(a % 2 != 0)
			{
				if(a < min_odd)
				{
					min_odd = a;
				}
			}
			if(a % 2 == 0)
			{
				if(a > max_even)
				{
					max_even = a;
				}
			}
		}
		System.out.println("Min Odd : "+min_odd);
		System.out.println("Max Even : "+max_even);
	}
}
