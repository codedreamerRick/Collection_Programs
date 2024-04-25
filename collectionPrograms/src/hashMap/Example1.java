package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put(12,  "hello");
		map.put(12.5,  'r');
		map.put(true,  false);
		map.put("rick", "medda");
		map.put(12,  "hi..");
		map.put(23, "medda");
		
		System.out.println(map);
		
		Collection keys = map.keySet();
		Collection values = map.values();
		Collection entry = map.entrySet();
		
		System.out.println("***** Keys *****");
		Iterator i = keys.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("***** Values *****");
		Iterator i1 = values.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("***** Entries *****");
		Iterator i2 = entry.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
