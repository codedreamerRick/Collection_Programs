package penRemove;

import java.util.ArrayList;

public class SumOfPenPrice {

	public static void main(String[] args) {
		ArrayList  arr = new  ArrayList();
		arr.add(new Pen(10, "Red"));
		arr.add(new Pen(20, "Blue"));
		arr.add(new Pen(30, "Red"));
		arr.add(new Pen(40, "Green"));
		arr.add(new Pen(50, "Black"));
		arr.add(new Pen(25, "Blue"));
		int sum = 0;
		for(Object o  : arr)
		{
			sum += ((Pen)o).price;
		}
		System.out.println(sum);
	}
}
