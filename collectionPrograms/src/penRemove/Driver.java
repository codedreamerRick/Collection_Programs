package penRemove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Driver {

	public static void main(String[] args) {
		ArrayList  arr = new  ArrayList();
		arr.add(new Pen(10, "Red"));
		arr.add(new Pen(20, "Blue"));
		arr.add(new Pen(30, "Red"));
		arr.add(new Pen(40, "Green"));
		arr.add(new Pen(50, "Black"));
		arr.add(new Pen(25, "Blue"));
		
		Iterator i = arr.iterator();
		while(i.hasNext())
		{
			if(((Pen)i.next()).price > 30)
			{
				i.remove();
			}
		}
		System.out.println(arr);
		
		
		ListIterator li = arr.listIterator(2);
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
