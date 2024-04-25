package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet<>();
		set.add(10);
		set.add(13);
		set.add(true);
		set.add(44.78);
		set.add("Java");
		set.add(45576588);
		set.add(true);
		set.add(null);
		set.add(null);
		
		Iterator i = set.iterator(); ;
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
//		System.out.println(set);
	}
}
