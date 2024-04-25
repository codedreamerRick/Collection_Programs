package collection;

import java.util.ArrayList;

public class Bag {

	public static void main(String[] args) {
		ArrayList bag = new ArrayList();
		bag.add("English");
		bag.add("Bengali");
		bag.add("Hindi");
		System.out.println(bag);
		bag.remove(1);
		bag.add(23.90);
		bag.add('3');
//		bag.remove('3'); 
		bag.remove((Object)'3'); 
		System.out.println(bag);
	}
	
}
